package com.prabodha.sheduleservice.kafka;

//import com.prabodha.basecommons.basecommons.dto.Inventory;
//import com.prabodha.basecommons.basecommons.dto.OrderEvent;

import com.prabodha.sheduleservice.Repository.OrderRepository;
import dto.Inventory;
import dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @Autowired
    OrderRepository orderRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    public OrderConsumer(OrderRepository orderRepository, KafkaTemplate<String, OrderEvent> template) {
//        this.repository = repository;
        this.orderRepository = orderRepository;
        this.template = template;
    }

    private KafkaTemplate<String, OrderEvent> template;

    @KafkaListener(
            topics = "${spring.kafka.topic.name1}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
        public void consumer(OrderEvent event) {
        LOGGER.info(String.format("get order to shedule => %s", event.toString()));
//        OrderEvent orderEvent = orderRepository.findById((event.getOrderId()));
       if (event.getStatus().equals("ACCEPT")) {

            ///    event.setShedule_date(event.getShedule_date());
//
                orderRepository.save(event);
//
            }



            LOGGER.info(String.format("Shedule Allocated the order in Order service => %s", event.toString()));


        }



    }
