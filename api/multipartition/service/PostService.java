package com.project.kafka.api.multipartition.service;

import com.project.kafka.api.multipartition.common.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostService {

    private final Logger LOG = (Logger) LoggerFactory.getLogger(PostService.class);

    @Autowired
    private KafkaTemplate<String, Post> kafkaTemplate;

    private final String TOPIC_NAME = "post";

    public void send(Post post) {
        post.setPostDate(LocalDateTime.now());
        LOG.info("Sending Post Json Serializer : {}", post);
       // kafkaTemplate.send(TOPIC_NAME, "1", post);
        kafkaTemplate.send(TOPIC_NAME, "2", post);

    }
}
