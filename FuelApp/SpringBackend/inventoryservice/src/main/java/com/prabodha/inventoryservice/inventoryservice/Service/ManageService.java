package com.prabodha.inventoryservice.inventoryservice.Service;


//import com.prabodha.basecommons.basecommons.dto.Inventory;
//import com.prabodha.basecommons.basecommons.dto.OrderEvent;
import com.prabodha.inventoryservice.inventoryservice.Repository.InventoryRepository;
import dto.Inventory;
import dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;


public class ManageService {

    //private static final String SOURCE = "inventory";
//    private static final Logger LOG = LoggerFactory.getLogger(ManageService.class);
//    @Autowired
//    private InventoryRepository inventoryrepository;
//    private KafkaTemplate<String, OrderEvent> template;

//    public ManageService(InventoryRepository inventoryrepository, KafkaTemplate<String, OrderEvent> template) {
//        this.inventoryrepository = inventoryrepository;
//        this.template = template;
//    }


//    public void reserve(OrderEvent event) {
//        if (event.getStatus().equals("PENDING")) {

           //Inventory inventory =  inventoryrepository.findByType((event.getType()));
         //   Inventory inventory = inventoryrepository.findByType((event.getType()));


        //    if (event.getCapacity() < inventory.getAvailable_qty()) {
                   //  System.out.println("dnfdnndmnmnm");
//                      LOGGER.info(String.format("Order event received in stock service => %s", inventory.getAvailable_qty()));

//                      inventory.setReceiveQty(inventory.getReceiveQty() + event.getCapacity());
//                      inventory.setAvailableQty(inventory.getAvailableQty() - event.getCapacity());

         //   }
//                  else {
//                      event.setStatus("REJECT");
//                  }






      //  }

}







