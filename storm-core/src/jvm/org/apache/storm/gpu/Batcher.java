package org.apache.storm.gpu;

import org.jocl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/27.
 */
public class Batcher {
    private cl_mem hostMem;
    private int batchSize;
    private Pointer[] hostMemPointers;
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
            }
        }
      return true;
    }
}
