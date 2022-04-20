package com.project.kafka.api.simple.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @KafkaListener(topics = "topic",
            groupId = "group_id")

    // Method
    public void consume(String message) {
        System.out.println("message = " + message);
    }
}
