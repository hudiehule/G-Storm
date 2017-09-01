package org.apache.storm.gpu;

import org.apache.storm.tuple.Tuple;
import org.jocl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/27.
 */
public class Batcher {
    private cl_mem hostMem;
    private int batchSize;
    private BufferManager bufferManager;

    Batcher(int size){
       batchSize = size;
    }
    public boolean initBuffer(HashMap<String,Integer> tupleArguementMap){
        for(Map.Entry<String, Integer> entry:tupleArguementMap.entrySet()){
            String c = entry.getKey();
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
            }else if(c.equals("Character")){
                Character[] characterBuffer = new Character[batchSize];
            }else if(c.equals("byte")){
                byte[] byteBuffer = new byte[batchSize];
            }
        }
      return true;
    }

    /**
     * call the BufferManager to add one tuple to the host tupleBuffer
     * @param tuple incomming tuple form upstream
     */
    public void addTuple(Tuple tuple){

    }

    /**
     * call the BufferManager to copy the tuples from the host memery to the device memory
     */
    public void transferTuples(){

    }


}
