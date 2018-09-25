package io.dunyalabs.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.dunyalabs.kafka.db.MongoDao;
import io.dunyalabs.kafka.model.Data;
import io.dunyalabs.kafka.model.IKafkaConstants;

@Service
public class APIConsumerService {

	private MongoDao mongoClient = new MongoDao();
	@Autowired
	private ObjectMapper objMapper;

	@KafkaListener(topics = IKafkaConstants.TOPIC_NAME, groupId = IKafkaConstants.GROUP_ID_CONFIG)
	public void consumeMessages(String message) {
		mongoClient.insertToMongo(message);
		System.out.println("Successfully inserted message: " + message);
	}

	@KafkaListener(topics = IKafkaConstants.TOPIC_NAME_JSON, groupId = IKafkaConstants.GROUP_ID_CONFIG_JSON, containerFactory="jsonKafkaListenerContainerFactory")
	public void consumeJsonMessages(Data data) throws JsonProcessingException {
		mongoClient.insertToMongo(objMapper.writeValueAsString(data));
	}

}
