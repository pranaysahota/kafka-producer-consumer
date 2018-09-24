package io.dunyalabs.kafka.db;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class MongoClientDemo {
	private static MongoDatabase database;
	private static MongoClient mongo;
	private static MongoCollection<Document> collection;
	static {
		mongo = new MongoClient("localhost", 27017);
		database = mongo.getDatabase("testdb");
		collection = database.getCollection("demo_collection");
	}
	
	public void insertToMongo(String message) {
		 
		Document document = new Document("Message", message);
		collection.insertOne(document);
		System.out.println("Document inserted successfully");
	}
}
