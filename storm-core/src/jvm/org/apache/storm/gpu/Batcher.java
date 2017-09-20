package org.apache.storm.gpu;

import org.apache.storm.tuple.Tuple;
import org.jocl.*;

import java.util.HashMap;
import java.util.List;
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

    public BufferManager getBufferManager(){
        return bufferManager;
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

    /**
     * copie the output data from the GPU back to the host
     */
    public void getBatchResult(){

    }

}
