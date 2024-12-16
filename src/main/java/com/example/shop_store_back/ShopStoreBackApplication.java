package com.example.shop_store_back;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ShopStoreBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopStoreBackApplication.class, args);
	}

//	@Bean
//	CommandLineRunner comaCommandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
//		return  args ->{
//			kafkaTemplate.send("amigoscode", "Key","Hello Kafka");
//		};
//	}
}
