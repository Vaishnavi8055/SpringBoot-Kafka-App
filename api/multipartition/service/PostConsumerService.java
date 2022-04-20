package com.project.kafka.api.multipartition.service;

import com.project.kafka.api.multipartition.common.Post;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class PostConsumerService {

    // consumer group with 2 consumers
    @KafkaListener(topics = "post", concurrency = "2", groupId = "group1")
    public void listen(Post post) {
        System.out.println("Received Post information : " + post);
    }


   /* @KafkaListener(topicPartitions =
            {@TopicPartition(topic = "post", partitions = {"1"}),
            })
    public void listen(Post post) {
        System.out.println("Received Post information : " + post);
    }*/

}
