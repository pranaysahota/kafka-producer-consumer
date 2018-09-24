package io.dunyalabs.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication /* implements ApplicationRunner */ {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}
}
