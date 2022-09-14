package pe.com.projectbanco.bootcoinservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nroAccount;
    private double balance;
    private Integer limit;
    private Integer nroTransaction;
}
