//package com.jpa.springDataJpaPractice.kafka;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ProducerClass {
//
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    public ProducerClass(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendMessage(String message)
//    {
//        kafkaTemplate.send("LatestTopic1", message);
//    }
//}
