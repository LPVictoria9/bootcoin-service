package pe.com.projectbanco.ptwopservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import pe.com.projectbanco.ptwopservice.model.Customer;
import pe.com.projectbanco.ptwopservice.service.ICustomerService;
import reactor.core.publisher.Flux;

public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<Flux<Customer>> findAllCustomer() {
        Flux<Customer> listCustomer = iCustomerService.findAll();
        return new ResponseEntity<Flux<Customer>>(listCustomer, HttpStatus.OK);
    }
}
