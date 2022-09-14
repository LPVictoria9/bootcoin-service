package pe.com.projectbanco.ProyectoI.controller;

import org.junit.jupiter.api.Disabled;
import  org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CreditControllerTest {
    @Autowired
    private WebTestClient webTestClient;
     @Test
    void findAllCredits(){
         this.webTestClient
                 .get();

     }
}
