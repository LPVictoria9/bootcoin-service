package pe.com.projectbanco.ptwopservice.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pe.com.projectbanco.ptwopservice.model.Customer;

public interface ICustomerRepo  extends ReactiveMongoRepository<Customer,String> {
}
