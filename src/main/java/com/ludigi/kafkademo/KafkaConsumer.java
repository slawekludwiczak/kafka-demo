package com.ludigi.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "sampleTopic")
    public void listen(String message) {
        System.out.println("Odebrano wiadomość z Kafki: " + message);
    }
}