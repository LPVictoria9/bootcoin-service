package pe.com.projectbanco.ptwopservice.service;

import org.springframework.data.mongodb.repository.Query;
import pe.com.projectbanco.ptwopservice.model.Customer;
import reactor.core.publisher.Flux;

public interface ICustomerService extends ICRUD<Customer, String> {
    @Query("{'type':?0}")
    Flux<Customer> findByType(String type);

    @Query("{'ruc':?0}")
    Flux<Customer> findByRUC(String ruc);

    @Query("{'dni':?0}")
    Flux<Customer> findByDNI(String dni);
}
