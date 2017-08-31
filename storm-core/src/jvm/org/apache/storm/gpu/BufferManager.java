package org.apache.storm.gpu;

import org.apache.storm.tuple.Tuple;

import java.nio.Buffer;

/**
 * Created by Administrator on 2017/7/27.
 */
public class BufferManager {
    private Buffer tupleBuffer;
    private Buffer indexBuffer;
    /**
      Construct a tuple buffer of sufficient size in host memory to hold incoming tuples.
    * */
    public Buffer initBuffers(long size,long valueSize){

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
