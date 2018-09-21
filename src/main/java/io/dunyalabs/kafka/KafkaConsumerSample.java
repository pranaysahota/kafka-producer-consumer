package io.dunyalabs.kafka;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class KafkaConsumerSample {
	public static void main(String[] args) {
		String topicName = "test_topic";
		String consumerGroup = "consumerGroup";
		Properties kafkaProperties = new Properties();
		kafkaProperties.put("bootstrap.servers", IKafkaConstants.KAFKA_BROKERS);
		kafkaProperties.put("group.id", consumerGroup);
		kafkaProperties.put("enable.auto.commit", "true");
		kafkaProperties.put("auto.commit.interval.ms", "1000");
		kafkaProperties.put("session.timeout.ms", "30000");
		kafkaProperties.put("key.deserializer", "org.apache.kafka.common.serializa-tion.StringDeserializer");
		kafkaProperties.put("value.deserializer", "org.apache.kafka.common.serializa-tion.StringDeserializer");

		Consumer<String, String> consumer = new KafkaConsumer<String, String>(kafkaProperties);
		//consumer.subscribe(Arrays.asList(topicName));
		consumer.subscribe(Collections.singletonList(topicName));
		System.out.println("Subscribed to topic: " + topicName);

		while (true) {
			Duration timeout = null;
			ConsumerRecords<String, String> consumerRecords = consumer.poll(timeout);
			for (ConsumerRecord<String, String> record : consumerRecords) {
				System.out.println("Offset: " + record.offset() + ", " + "Value: " + record.value());
			}
			break;
		}
		consumer.close();
	}
}
