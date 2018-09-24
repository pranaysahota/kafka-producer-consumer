package io.dunyalabs.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import io.dunyalabs.kafka.db.MongoClientDemo;
import io.dunyalabs.kafka.model.IKafkaConstants;

@Service
public class APIConsumerService {

	private MongoClientDemo mongoClient = new MongoClientDemo();

	@KafkaListener(topics = IKafkaConstants.TOPIC_NAME, groupId = IKafkaConstants.GROUP_ID_CONFIG)
	public void consumeMessages(String message) {
		mongoClient.insertToMongo(message);
		System.out.println("Successfully inserted message: " + message);
	}

}
