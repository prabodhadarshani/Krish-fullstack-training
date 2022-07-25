package com.prabodha.rentcar.demoapplication;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "stage")
public class StageEndpoint {

  public Map<String , Stage> Stages = new ConcurrentHashMap<>();
    @ReadOperation
    public Map<String ,Stage> getAllStages(){
        return Stages;
    }
    @ReadOperation
    public Stage getStage(@Selector String name){
        return  Stages.get(name);
    }
//    @WriteOperation
//    public void setValue(@Selector String name , Stage stage){
//            Stages.put(name,stage);
//    }

    @WriteOperation
    public void setValue(@Selector String name , int stage){
        Stages.put(name, new Stage(stage));
    }

    static class Stage{
//        String value;
//
//        public Stage(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        public void setValue(String value) {
//            this.value = value;
//        }

                int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }


}
