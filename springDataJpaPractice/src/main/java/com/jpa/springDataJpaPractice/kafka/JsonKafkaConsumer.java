//package com.jpa.springDataJpaPractice.kafka;
//
//import com.jpa.springDataJpaPractice.payload.User;
//import lombok.ToString;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//
//@Slf4j
//@Service
//public class JsonKafkaConsumer {
//
//    @KafkaListener(topics ="LatestTopic2", groupId = "myGroup")
//    public void jsonConsumer(User user)
//    {
//        log.info("just checking the log: : : :");
//        log.info("user is:    {}", user.toString().toString());
//        System.out.println(user.toString());
//        log.info("user is     :    {}", user.getFirstname());
//    }
//}
