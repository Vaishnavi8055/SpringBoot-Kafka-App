
package com.project.kafka.api.simple.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/kafka")
public class ProducerController {

    private static final String TOPIC_NAME = "topic";

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    // Publish messages using the GetMapping
    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable("message")
                                 final String message)
    {

        // Sending the message
        kafkaTemplate.send(TOPIC_NAME, message);

        return "Published Successfully !! Go & Check on Terminal";
    }

}

