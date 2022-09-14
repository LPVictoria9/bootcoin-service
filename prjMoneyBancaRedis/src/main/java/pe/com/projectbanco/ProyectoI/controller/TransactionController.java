package pe.com.projectbanco.ProyectoI.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.com.projectbanco.ProyectoI.model.Transaction;
import pe.com.projectbanco.ProyectoI.repo.impl.TransactiontServiceImpl;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private TransactiontServiceImpl transactionService;
    private static final Logger logger = LoggerFactory.getLogger(TransactionController.class);

    public TransactionController(TransactiontServiceImpl transactionService) {
        this.transactionService = transactionService;
    }
    @GetMapping(produces = "application/json")
    public ResponseEntity<Map<String, Transaction>> findAll(){
        return new ResponseEntity<>(transactionService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value ="/{id}", produces = "application/json")
    public ResponseEntity<Transaction> findById(@PathVariable String id){
        return new ResponseEntity<Transaction>(transactionService.findById(id),HttpStatus.OK);
    }

    @PostMapping(produces = "application/json")
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction){
        transactionService.save(transaction);
        return new ResponseEntity<Transaction>(transaction,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable String id){
        transactionService.delete(id);
    }

}
