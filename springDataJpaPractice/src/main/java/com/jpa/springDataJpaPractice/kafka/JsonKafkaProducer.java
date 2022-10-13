//package com.jpa.springDataJpaPractice.kafka;
//
//import com.jpa.springDataJpaPractice.payload.User;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.KafkaHeaders;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Service;
//
//@Slf4j
//@Service
//public class JsonKafkaProducer {
//
//    KafkaTemplate<String, User> kafkaTemplate;
//
//    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void setJson(User user)
//    {
//        log.info("data is :  {}", user.toString());
//        Message<User> message = MessageBuilder
//                .withPayload(user)
//                .setHeader(KafkaHeaders.TOPIC, "LatestTopic2")
//                .build();
//
//        kafkaTemplate.send(message);
//
//        // To create an event souce, we use real time streaming data by
//
//    }
//}
