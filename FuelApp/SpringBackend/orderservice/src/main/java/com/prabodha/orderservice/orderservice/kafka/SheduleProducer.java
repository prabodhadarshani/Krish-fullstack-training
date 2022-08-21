package com.prabodha.orderservice.orderservice.kafka;

import dto.OrderEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
@Service
public class SheduleProducer {


        private static final Logger LOGGER = LoggerFactory.getLogger(SheduleProducer.class);

        private NewTopic topicSheduleResult;


        private KafkaTemplate<String, OrderEvent> kafkaTemplate;

        public SheduleProducer(NewTopic topicSheduleResult, KafkaTemplate<String, OrderEvent> kafkaTemplate) {
            this.topicSheduleResult = topicSheduleResult;
            this.kafkaTemplate = kafkaTemplate;
        }

        public void sendMessage(OrderEvent event){
            LOGGER.info(String.format("Order event => %s", event.toString()));

            // create Message
            Message<OrderEvent> message = MessageBuilder
                    .withPayload(event)
                    .setHeader(KafkaHeaders.TOPIC, topicSheduleResult.name())

                    .build();
            kafkaTemplate.send(message);
        }

}
