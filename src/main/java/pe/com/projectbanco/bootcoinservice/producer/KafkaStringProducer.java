package pe.com.projectbanco.bootcoinservice.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import pe.com.projectbanco.bootcoinservice.model.Transaction;

@Component
public class KafkaStringProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaStringProducer.class);

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaStringProducer(@Qualifier("kafkaStringTemplate") KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        LOGGER.info("Producing  {}", message);
        this.kafkaTemplate.send("TOPIC-PROJECT", message);
    }
    public void createTransaction(Transaction transaction) {
        LOGGER.info("Producing transaction {}", transaction);
        this.kafkaTemplate.send("TOPIC-PROJECT",transaction.toString() );
    }
}
