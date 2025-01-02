package com.example.demo.kafka;
import java.util.List;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, List<String>> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, List<String>> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, List<String> message) {
        kafkaTemplate.send(topic, message);
        System.out.println("Sent message: " + message);
    }
}
