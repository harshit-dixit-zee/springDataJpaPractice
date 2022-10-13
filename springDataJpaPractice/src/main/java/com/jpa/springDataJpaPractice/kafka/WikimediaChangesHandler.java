//package com.jpa.springDataJpaPractice.kafka;
//
//import com.launchdarkly.eventsource.EventHandler;
//import com.launchdarkly.eventsource.MessageEvent;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.core.KafkaTemplate;
//
//@Slf4j
//// Event Hanlder will get triggered when there is new event in wikimedia and then calls onMessage method
//public class WikimediaChangesHandler implements EventHandler {
//    private KafkaTemplate<String, String> kafkaTemplate;
//    private String topic;
//
//    public WikimediaChangesHandler(KafkaTemplate<String, String> kafkaTemplate, String topic) {
//        this.kafkaTemplate = kafkaTemplate;
//        this.topic = topic;
//    }
//
//    @Override
//    public void onOpen() throws Exception {
//
//    }
//
//    @Override
//    public void onClosed() throws Exception {
//
//    }
//
//    // This message reads the message whenever there is any new event occurs in wikimedia
//    @Override
//    public void onMessage(String s, MessageEvent messageEvent) throws Exception {
//        log.info("The eventMessage data is:    {}", messageEvent.getData());
//        kafkaTemplate.send(topic, messageEvent.getData());
//
//    }
//
//    @Override
//    public void onComment(String s) throws Exception {
//
//    }
//
//    @Override
//    public void onError(Throwable throwable) {
//
//    }
//}
