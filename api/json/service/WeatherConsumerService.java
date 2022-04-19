package com.project.kafka.api.json.service;

import com.project.kafka.api.json.common.Weather;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WeatherConsumerService {

    @KafkaListener(topics = "weather", groupId = "group_id")
    public void listen(Weather weather) {
        System.out.println("Received User information : " + weather);
    }

}
