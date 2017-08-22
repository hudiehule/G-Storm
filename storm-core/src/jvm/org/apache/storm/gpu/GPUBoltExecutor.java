package org.apache.storm.gpu;



import org.apache.storm.generated.GPUBolt;
import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.*;
import org.apache.storm.tuple.Tuple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;


/**
 * Running a GpuBolt in the Executor
 * Created by Administrator on 2017/7/27.
 */
public class GPUBoltExecutor implements IRichBolt{
   public static final Logger LOG = LoggerFactory.getLogger(GPUBoltExecutor.class);
   private BaseGPUBolt _gpuBolt;


   public void declareOutputFields(OutputFieldsDeclarer declarer) {
      _gpuBolt.declareOutputFields(declarer);
   }
   private transient BasicOutputCollector _collector;

   public GPUBoltExecutor(BaseGPUBolt bolt){
      _gpuBolt = bolt;
   }

   public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
      _gpuBolt.prepare(stormConf, context);
      _collector = new BasicOutputCollector(collector);
   }

   public void execute(Tuple input) {
      _gpuBolt.execute(input);
   }

   public void cleanup() {
      _gpuBolt.cleanup();
   }

   public Map<String, Object> getComponentConfiguration() {
      return _gpuBolt.getComponentConfiguration();
   }
}
