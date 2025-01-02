package com.example.demo.kafka;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "test-topic", groupId = "test-group")
    public void listen(List<String> message) {
        System.out.println("Received message: " + message);
    }
}
