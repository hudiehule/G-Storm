package org.apache.storm.gpu.opencl;

/**
 * Created by Administrator on 2017/7/27.
 */
import org.jocl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.*;

import static org.jocl.CL.*;

public class Utils {
    private static final Logger LOG =  LoggerFactory.getLogger(Utils.class); //打印日志
    private static final int EXIT_SUCCESS = 0;
    private static final int EXIT_FAILURE = 1;
    private static final String platformName = "Intel(R) FPGA";

    public static void checkEror(int error,String msg){
        if(error != CL_SUCCESS){
            LOG.info("Error:"+stringFor_errorCode(error)+","+msg);
            System.exit(EXIT_FAILURE); //need to modify
        }
    }
    /*
       Query the first platform according to the platformName
     */
    public static cl_platform_id findPlatform(String platformName){
        int status;
        int numPlatforms;
        String search = platformName.toLowerCase(); //convert the name to lowercase

        // query the number of the all the platforms
        int[] platformNum = new int[1];
        status = clGetPlatformIDs(0,null,platformNum);
        checkEror(status,"Failed to get the platformNum");

        //query the all of the platformIDs
        numPlatforms= platformNum[0];
        cl_platform_id[] platformIDs = new cl_platform_id[numPlatforms];
        status = clGetPlatformIDs(numPlatforms,platformIDs,null);
        checkEror(status,"Failed to get the platformIDs");

        //for each platform, judge if it is a intel FPGA platform according to the name of the platformName
        for(int i = 0;i<numPlatforms;i++){
            String name = getPlatformInfoString(platformIDs[i],CL_PLATFORM_NAME);
            String nameLowercase = name.toLowerCase();
            if(nameLowercase.contains(search)){
                //Found return it
                return platformIDs[i];
            }
        }
        //No corresponding platform found
        return null;
    }

    /*
       Query the list of all devices
     */
    public static cl_device_id[] getDevices(cl_platform_id pid,long devType){
        int status;
        int numDids;
        int[] numDevices= new int[1];
        //query the number of the devices
        status = clGetDeviceIDs(pid,devType,0,null,numDevices);
        checkEror(status,"Query for number of devices failed");

        //query all the deviceIDs
        numDids = numDevices[0];
        cl_device_id[] dids = new cl_device_id[numDids];
        status = clGetDeviceIDs(pid,devType,numDids,dids,null);
        checkEror(status,"Query for device ids failed");

        return dids;
    }
    /*
      Release the cl resource
     */
    public static void cleanupClResource(cl_program program,cl_context context,cl_command_queue[] queues,cl_kernel[] kernels){
        if(program!= null){
            clReleaseProgram(program);
        }
        if(context != null){
            clReleaseContext(context);
        }
        for(cl_command_queue queue :queues){
            if(queue != null) clReleaseCommandQueue(queue);
        }
        for(cl_kernel kernel : kernels){
            if(kernel != null) clReleaseKernel(kernel);
        }
    }

    public static String getPlatformInfoString(cl_platform_id platform,int infoName){
        int status;

        //get the size of the info that willed be queried
        long size[] = new long[1];
        status = clGetPlatformInfo(platform,infoName,0,null ,size);
        checkEror(status,"Query for platform name size failed");

        //create a buffer for the info
        byte buffer[] = new byte[(int)size[0]];
        status = clGetPlatformInfo(platform,infoName,buffer.length,Pointer.to(buffer),null);
        checkEror(status,"Query for platform name failed");

        //create a string form the buffer and return it
        return new String(buffer,0,buffer.length-1);
    }

    public static String getDeviceInfoString(cl_device_id did,int infoName){
        int status;

        //get size of info that willed be queried
        long size[] = new long[1];
        status = clGetDeviceInfo(did,infoName,0,null,size);
        checkEror(status,"Query for device name size failed");

        //create a buffer for the info
        byte buffer[]= new byte[(int)size[0]];
        status = clGetDeviceInfo(did,infoName,buffer.length,Pointer.to(buffer),null);
        checkEror(status,"Query for device name failed");

        //create a string form the buffer and return it
        return new String(buffer,0,buffer.length-1);

    }

    /*
      load the openCL kernel file provided by the user to the system
     */
    public static String[] loadKernelFileByPath(String filePath){
        String str;
        try{
            InputStream is = new FileInputStream(filePath);
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = in.readLine()) != null){
                buffer.append(line);
            }
            str = buffer.toString();
        }catch(FileNotFoundException e){
            LOG.error("The file in the path is not existed");
            return null;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
        return new String[]{str};
    }

}
