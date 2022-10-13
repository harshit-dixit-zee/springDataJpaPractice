//package com.jpa.springDataJpaPractice.controller;
//
//import com.jpa.springDataJpaPractice.kafka.JsonKafkaProducer;
//import com.jpa.springDataJpaPractice.kafka.ProducerClass;
//import com.jpa.springDataJpaPractice.payload.User;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@Slf4j
//@RestController
//public class TestController {
//
//    @Autowired
//    ProducerClass producerClass;
//    @Autowired
//    JsonKafkaProducer jsonKafkaProducer;
//
//    // The difference bw @PathVariable and @RequestParam
//    @GetMapping("/get")
//    public ResponseEntity<?> getMe(@RequestParam("message") String message)
//    {
//       // String message = "Hello World";
//        producerClass.sendMessage(message);
//
//        return ResponseEntity.ok("Message sent");
//
//    }
//
//    @PostMapping("/setJson")
//    public ResponseEntity<?> getMeJson(@RequestBody User user)
//    {
//        jsonKafkaProducer.setJson(user);
//        return ResponseEntity.ok("Message sent");
//    }
//    @GetMapping("/wikimedia")
//    public ResponseEntity<?> wikimedia()
//    {
//        return ResponseEntity.ok("everything fine");
//    }
//}
