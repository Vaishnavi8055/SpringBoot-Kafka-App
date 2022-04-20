package com.project.kafka.api.multipartition.controller;

import com.project.kafka.api.multipartition.common.Post;
import com.project.kafka.api.multipartition.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/kafka")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("post/producer")
    public String sendMessage(@RequestBody Post post) {
        postService.send(post);
        return "Message published successfully to the Kafka topic - post";
    }

}
