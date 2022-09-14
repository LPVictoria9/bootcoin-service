package pe.com.projectbanco.bootcoinservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.com.projectbanco.bootcoinservice.model.Transaction;
import pe.com.projectbanco.bootcoinservice.producer.KafkaStringProducer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final KafkaStringProducer kafkaStringProducer;

    @Autowired
    KafkaController(KafkaStringProducer kafkaStringProducer) {
        this.kafkaStringProducer = kafkaStringProducer;
    }

    @PostMapping(value = "/publish", consumes = "application/json", produces = "application/json")
    public void sendTransactionToKafkaTopic(@RequestParam("transaction")String transaction) {
        this.kafkaStringProducer.sendMessage(transaction);
    }

    /*@PostMapping(value = "/createTransaction", consumes = "application/json", produces = "application/json")
    public void createTransaction(@RequestParam("transaction") @RequestBody Transaction transaction) {

        this.kafkaStringProducer.createTransaction(transaction);
    }*/



}
