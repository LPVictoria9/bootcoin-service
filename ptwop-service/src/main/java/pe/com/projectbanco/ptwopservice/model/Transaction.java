package pe.com.projectbanco.ptwopservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {

    //@Id
    private String id;
    private String amount; //DNI (D) CEX (C) , PASSAPORT (P)
    private String typeOfpayment;
    private Customer customer;
}
