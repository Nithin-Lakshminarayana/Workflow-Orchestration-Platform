package com.workflow.orchestration.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.UuidRepresentation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

  @Override
  protected String getDatabaseName() {
    return "db_workflow_orchestration_platform";
  }

  @Override
  @Bean
  public MongoClient mongoClient() {
    ConnectionString connectionString = new ConnectionString(
        "mongodb://localhost:27017/db_workflow_orchestration_platform");
    MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .uuidRepresentation(UuidRepresentation.STANDARD)
        .build();
    return MongoClients.create(mongoClientSettings);
  }
}
