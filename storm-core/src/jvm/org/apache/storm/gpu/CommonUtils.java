package org.apache.storm.gpu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/18.
 */
public class CommonUtils {
    public static HashMap<String,Integer> primitiveTypes = new HashMap<>();
    static{
        primitiveTypes.put("boolean",1);
        primitiveTypes.put("char",1);
        primitiveTypes.put("byte",1);
        primitiveTypes.put("short",2);
        primitiveTypes.put("int",4);
        primitiveTypes.put("long",8);
        primitiveTypes.put("float",4);
        primitiveTypes.put("double",8);

    }
    /**
     check whether the tuple argument type is valid.
     */
    public static void checkTupleArgumentType(List<String> inputList, List<String> outputList){

            if(inputList.isEmpty()){
                throw new IllegalArgumentException("Undefined input tuple argument type");
            }
            for(String type :inputList){
                if(CommonUtils.primitiveTypes.containsKey(type))
                    throw new IllegalArgumentException("contains non-primitive input tuple argument type" );
            }
            for(String type :outputList){
                if(CommonUtils.primitiveTypes.containsKey(type))
                    throw new IllegalArgumentException("contains non-primitive output tuple argument type" );
            }

    }
}
