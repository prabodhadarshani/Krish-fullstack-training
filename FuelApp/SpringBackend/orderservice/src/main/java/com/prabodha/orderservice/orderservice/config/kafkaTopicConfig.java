package com.prabodha.orderservice.orderservice.config;


import org.apache.kafka.clients.admin.NewTopic;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;
    @Value("${spring.kafka.topic.name1}")
    private String orderResult;

    // spring bean for kafka topic
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(topicName)
                .build();
    }
//    @Bean
//    public NewTopic topicOrderResult(){
//        return TopicBuilder.name("OrderResult")
//                .build();
//    }
    @Bean
    public NewTopic topicSheduleResult() {
        return TopicBuilder.name(orderResult)
                .build();
    }
}