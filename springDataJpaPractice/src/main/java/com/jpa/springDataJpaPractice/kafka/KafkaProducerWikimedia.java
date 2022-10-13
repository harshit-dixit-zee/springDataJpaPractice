//package com.jpa.springDataJpaPractice.kafka;
//
//import com.launchdarkly.eventsource.EventHandler;
//import com.launchdarkly.eventsource.EventSource;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//import java.net.URI;
//import java.util.concurrent.TimeUnit;
//
//@Slf4j
//@Service
//// This producer reads the real time streaming data from wikimedia and push it to kafka broker
//
//public class KafkaProducerWikimedia {
//
//    public KafkaProducerWikimedia(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//    KafkaTemplate<String, String> kafkaTemplate;
//    public void sendMessage()
//    {
//        try
//        {
//            String topic = "WikimediaTopic";
//            EventHandler eventHandler = new WikimediaChangesHandler(kafkaTemplate, topic);
//            String url = "https://stream.wikimedia.org/v2/stream/WikimediaTopic";
//            EventSource.Builder builder = new EventSource.Builder(eventHandler, URI.create(url));
//            EventSource eventSource = builder.build();
//            eventSource.start();
//            TimeUnit.MINUTES.sleep(10l);
//        }
//       catch(Exception e)
//       {
//           System.out.println(e);
//       }
//    }
//
//}
