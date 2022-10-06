package com.kafka.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

        @KafkaListener(topics = "tim-topic", groupId = "tim-group")
        public void listen(String message) {
            System.out.println("Received Messasge in group - tim-group: " + message);
        }

        @KafkaListener(topics = "tim-topic", groupId = "tim-group-2")
        public void listen2(String message) {
            System.out.println("Received Messasge in group - tim-group-2: " + message);
        }

}
