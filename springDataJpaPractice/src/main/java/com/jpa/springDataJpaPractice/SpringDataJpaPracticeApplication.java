package com.jpa.springDataJpaPractice;

//import com.jpa.springDataJpaPractice.kafka.KafkaProducerWikimedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPracticeApplication.class, args);
	}

//	@Autowired
//	KafkaProducerWikimedia kafkaProducerWikimedia;
//
//	public void run(String... args) throws Exception
//	{
//		kafkaProducerWikimedia.sendMessage();
//	}
}
