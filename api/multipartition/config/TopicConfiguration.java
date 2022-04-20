package com.project.kafka.api.multipartition.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class TopicConfiguration {

    @Value(value = "${kafka.bootstrap.servers}")
    private String bootstrapAddress;


    // KafkaAdmin Spring bean, which will automatically add topics for all beans of type NewTopic
    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return new KafkaAdmin(configs);
    }

    /**
     * 1 -> likes
     * 2 -> comments
     * 3 -> shares
     * 4 -> views
     */
    @Bean
    public NewTopic topic1() {
        return new NewTopic("post", 4, (short) 1);
    }

}
