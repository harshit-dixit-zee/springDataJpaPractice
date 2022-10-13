//package com.jpa.springDataJpaPractice.kafka;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//@Slf4j
//@Service
//public class ConsumerClass {
//
//
//    KafkaTemplate<String, String> kafkaTemplate;
//
//    // KafkaListener is used in consumer ot subscribe to the topic and listen from it
//    @KafkaListener(topics = "LatestTopic", groupId = "myGroup")
//    public void consumeMessage(String message)
//    {
//        log.info("info, info, info, info");
//        log.info("message is   :{}", message);
//    }
//}
