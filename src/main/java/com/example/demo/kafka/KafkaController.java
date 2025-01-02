package com.example.demo.kafka;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	private static final Logger logger = LoggerFactory.getLogger(KafkaController.class);
    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/send")
    public List<String> sendMessage(@RequestParam("message") List<String> message) {
    	List<String> list=new ArrayList<>();
    	list.addAll(message);
        kafkaProducerService.sendMessage("test-topic", message);
        logger.info("Consumed message: {}", message);
        return  list;
        
       

    }
}
