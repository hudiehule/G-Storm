package org.apache.storm.gpu;

import org.apache.storm.tuple.Tuple;

import java.nio.Buffer;
import java.util.List;

/**
 * Created by Administrator on 2017/7/27.
 */
public class BufferManager {
    private Buffer tupleBuffer;
    private Buffer indexBuffer;
    /**
      Construct a tuple buffer of sufficient size in host memory to hold incoming tuples.
    * */
    public Buffer initBuffers(List<String> inputTuple, List<String> outputTuple){
        for(String c :inputTuple){
            if(c.equals("int")){
                int[] intBuffer = new int[batchSize];
            }else if(c.equals("long")){
                long[] longBuffer = new long[batchSize];
            }else if(c.equals("short")){
                short[] shortBuffer = new short[batchSize];
            }else if(c.equals("float")){
                float[] floatBuffer = new float[batchSize];
            }else if(c.equals("double")){
                double[] doubleBuffer = new double[batchSize];
            }else if(c.equals("char")){
                char[] charBuffer = new char[batchSize];
            }else if(c.equals("byte")){
                byte[] byteBuffer = new byte[batchSize];
            }else if(c.equals("boolean")){
                boolean[] booleansBuffer = new boolean[batchSize];
            }
        }
    }

    /**
     * Add the tuple to a pre-allocated tuple buffer
     */
    public void addTupleToBuffer(Tuple tuple){

    }

    /**
     * Copy the buffered tuples from the host memory to the device memory
     */
    public boolean transferTuplesToDevice(){

    }
}
