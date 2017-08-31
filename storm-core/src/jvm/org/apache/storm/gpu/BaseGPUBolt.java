package org.apache.storm.gpu;

import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.IRichBolt;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;
import org.jocl.*;
import static org.jocl.CL.*;
import org.apache.storm.gpu.opencl.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/27.
 * a GPU bolt that can be used to build topology by users
 */
public abstract class BaseGPUBolt implements IRichBolt{
    private static final Logger LOG = LoggerFactory.getLogger(BaseGPUBolt.class);
    private HostProgram hostProgram;
    private HashMap<String,Integer> inputTupleArgumentType = new HashMap<>(); //传入一个tuple的类型数据例如：int float 或者object
    private HashMap<String,Integer> outputTupleArgumentType = new HashMap<>(); //传入一个tuple的类型数据例如：int float 或者object
    private int batch = 1000;
    private Batcher batcher;
    private BufferManager bufferManager;
    private IndexBuilder indexBuilder;
    public BaseGPUBolt(String kernelName,String kernelFilePath,int batchSize){
        hostProgram = new HostProgram(kernelName,kernelFilePath);
        batch = batchSize;
    }

    public class HostProgram{
        cl_platform_id platform;
        cl_device_id[] deviceIds;
        String kernelName;
        String kernelFilePath;
        String[] kernelFile;
        cl_context context;
        cl_command_queue queue;
        cl_kernel kernel;
        cl_program program;
        HostProgram(String name,String path){
            kernelName = name;
            kernelFilePath = path;
        }
        public boolean initCL(){
            int[] error = new int[1];
            platform = Utils.findPlatform("Intel");
            if(platform == null){
                LOG.error("Failed to find the GPU platform");
            }
            deviceIds = Utils.getDevices(platform,CL_DEVICE_TYPE_GPU);
            if(deviceIds == null){
                LOG.error("Failed to find GPU devices");
            }
            cl_context_properties contextProperties = new cl_context_properties();
            contextProperties.addProperty(CL_CONTEXT_PLATFORM, platform);

            context = clCreateContext(
                    contextProperties, 1, deviceIds,
                    null, null, error);
            Utils.checkEror(error[1],"Failed to create the context");

            queue = clCreateCommandQueueWithProperties(
                    context, deviceIds[0], null, error);
            Utils.checkEror(error[1],"Failed to create the commandQueue");

            kernelFile = Utils.loadKernelFileByPath(kernelFilePath);
            if(kernelFile == null){
                LOG.error("Failed to load the kernel file");
            }
            program = clCreateProgramWithSource(context,
                    1,kernelFile,null,error);
            Utils.checkEror(error[1],"Failed to create the program");

            error[1] = clBuildProgram(program,1,deviceIds,null,null,null);
            Utils.checkEror(error[1],"Failed to build the program");

            kernel = clCreateKernel(program,kernelName,error);
            Utils.checkEror(error[1],"Failed to create the kernel");
            return true;
        }
    }

    public void prepare(Map stormConf, TopologyContext topologyContext) {
        /*
        * initial the Batcher, BufferManager and IndexBuilder
        * initial the platform and device
        * create the objects of  openCL host
        *
        */
        hostProgram.initCL();
        userPrepare(stormConf,topologyContext);//用户自定义的prepare函数
        inputTupleArgumentType = setInputTupleArgumentType();//初始化该bolt要处理的tuple包含的参数类型和大小
        if(inputTupleArgumentType.isEmpty()){
            LOG.error("Undefined input tuple argument type");
        }
        outputTupleArgumentType = setOutputTupleArgumentType();
        if(outputTupleArgumentType.isEmpty()){
            LOG.error("Undefined output tuple argument type");
        }
        batcher = new Batcher(batch);
        batcher.initBuffer(inputTupleArgumentType);
    }

    public void execute(Tuple tuple){
    /*
       来一个tuple 使用batcher 将其放入global 内存中 tuple的个数达到设定值以后 将这一批tuple
       发送给GPU进行处理
    */

    }
    @Override
    public void cleanup() {
    }

    public abstract HashMap<String,Integer> setInputTupleArgumentType(); //必须要实现的接口 获取这个bolt要处理的数据类型和大小
    public abstract HashMap<String,Integer> setOutputTupleArgumentType();
    public abstract void userPrepare(Map stormConf, TopologyContext topologyContext);//用户自定义prepare函数
}
