package com.project.kafka.api.json.service;

import com.project.kafka.api.json.common.Weather;
import com.project.kafka.api.json.request.WeatherRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private final Logger LOG = (Logger) LoggerFactory.getLogger(WeatherService.class);
    @Autowired
    private KafkaTemplate<String, Weather> kafkaTemplate;

    private final String TOPIC_NAME = "weather";


    public void send(WeatherRequest weatherRequest) {

        Weather weather = new Weather();
        weather.setCity(weatherRequest.getCity());
        weather.setState(weatherRequest.getState());
        weather.setTemperature(weatherRequest.getTemperature());

        LOG.info("Sending Weather Json Serializer : {}", weather);
        // topic , data
        kafkaTemplate.send(TOPIC_NAME, weather);
    }

}
