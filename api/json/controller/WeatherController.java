package com.project.kafka.api.json.controller;

import com.project.kafka.api.json.common.Weather;
import com.project.kafka.api.json.request.WeatherRequest;
import com.project.kafka.api.json.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/kafka")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;


    @PostMapping("/producer")
    public String sendMessage(@RequestBody WeatherRequest weatherRequest) {
        weatherService.send(weatherRequest);
        return "Message published successfully to the Kafka topic - weather";
    }

}
