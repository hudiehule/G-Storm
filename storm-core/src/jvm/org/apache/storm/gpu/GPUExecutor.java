package org.apache.storm.gpu;


import com.lmax.disruptor.EventHandler;
import org.apache.storm.generated.DebugOptions;
import org.apache.storm.topology.IRichBolt;
import org.apache.storm.tuple.AddressedTuple;
import org.apache.storm.tuple.TupleImpl;
import org.apache.storm.utils.DisruptorQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Administrator on 2017/7/27.
 */
public class GPUExecutor implements Callable, EventHandler<Object> {
    private static final Logger LOG = LoggerFactory.getLogger(GPUExecutor.class);

    protected final List<Long> executorId;
    protected final List<Integer> taskIds;
    protected final String componentId;
    protected final AtomicBoolean openOrPrepareWasCalled;
    protected final Map<String, Object> topoConf;
    protected final Map<String, Object> conf;
    protected final String stormId;
    protected final HashMap sharedExecutorData;
    protected final AtomicBoolean stormActive;
    protected final AtomicReference<Map<String, DebugOptions>> stormComponentDebug;
    protected final Runnable suicideFn;
    protected final String type;
    protected final DisruptorQueue receiveQueue; // receive the tuples


    public GPUExecutor(IRichBolt bolt){

    }
    @SuppressWarnings("unchecked")
    @Override
    public void onEvent(Object event, long seq, boolean endOfBatch) throws Exception {
        ArrayList<AddressedTuple> addressedTuples = (ArrayList<AddressedTuple>) event;
        for (AddressedTuple addressedTuple : addressedTuples) {
            TupleImpl tuple = (TupleImpl) addressedTuple.getTuple();
            int taskId = addressedTuple.getDest();
            if (isDebug) {
                LOG.info("Processing received message FOR {} TUPLE: {}", taskId, tuple);
            }
            if (taskId != AddressedTuple.BROADCAST_DEST) {
                tupleActionFn(taskId, tuple);
            } else {
                for (Integer t : taskIds) {
                    tupleActionFn(t, tuple);
                }
            }
        }
    }

    @Override
    public Callable<Object> call() throws Exception {
        init(idToTask);

        return new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                receiveQueue.consumeBatchWhenAvailable(BoltExecutor.this);
                return 0L;
            }
        };
    }

}
