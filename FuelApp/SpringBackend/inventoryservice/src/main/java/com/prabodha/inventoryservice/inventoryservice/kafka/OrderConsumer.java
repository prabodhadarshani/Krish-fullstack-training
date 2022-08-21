package com.prabodha.inventoryservice.inventoryservice.kafka;

//import com.prabodha.basecommons.basecommons.dto.Inventory;
//import com.prabodha.basecommons.basecommons.dto.OrderEvent;

import com.prabodha.inventoryservice.inventoryservice.Repository.InventoryRepository;

import com.prabodha.inventoryservice.inventoryservice.Repository.OrderRepository;
import com.prabodha.inventoryservice.inventoryservice.Service.ManageService;
//import com.prabodha.orderservice.orderservice.Repository.OrderRepository;
import dto.Inventory;
import dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderConsumer {


    @Autowired
   InventoryRepository repository;

   @Autowired
   OrderRepository orderRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    public OrderConsumer(OrderRepository orderRepository, InventoryRepository repository, KafkaTemplate<String, OrderEvent> template) {
        this.repository = repository;
        this.orderRepository = orderRepository;
        this.template = template;
    }

    private KafkaTemplate<String, OrderEvent> template;

    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(OrderEvent event) {
        LOGGER.info(String.format("Order event received in stock service => %s", event.toString()));


        if (event.getStatus().equals("PENDING")) {
            Inventory inventory = repository.findByType((event.getType()));
            if (event.getCapacity() < inventory.getAvailable_qty()) {
                event.setStatus("ACCEPT");
              // LOGGER.info(String.format("", inventory.getAvailable_qty()));
                inventory.setReceive_qty(inventory.getReceive_qty() + event.getCapacity());
                inventory.setAvailable_qty(inventory.getAvailable_qty() - event.getCapacity());

                repository.save(inventory);

            }
                  else {
                     event.setStatus("REJECT");
                 }


            LOGGER.info(String.format("Stock Allocated the order in Order service => %s", event.toString()));

              orderRepository.save(event);
           // template.send("result_shedule", event);
        }
    }}
