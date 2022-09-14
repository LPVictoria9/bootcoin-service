package pe.com.projectbanco.ptwopservice.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaStringConsumer {
    Logger logger = LoggerFactory.getLogger(KafkaStringConsumer.class);

    @KafkaListener(topics = "TOPIC-PROJECT", groupId = "group_id")
    public void consume(String transaction) {
        logger.info("Consuming transaction {}", transaction);
    }
}
