package pe.com.projectbanco.ptwopservice.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.projectbanco.ptwopservice.model.Customer;
import pe.com.projectbanco.ptwopservice.repo.ICustomerRepo;
import pe.com.projectbanco.ptwopservice.service.ICustomerService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepo iCustomerRepo;

    @Override
    public Mono<Customer> create(Customer obj) {
        return iCustomerRepo.save(obj);
    }

    @Override
    public Mono<Customer> update(Customer obj) {
        return null;
    }

    @Override
    public Flux<Customer> findAll() {
        return iCustomerRepo.findAll();
    }

    @Override
    public Mono<Customer> listPorId(String id) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return iCustomerRepo.deleteById(id);
    }

    @Override
    public Mono<Void> delete(Customer obj) {
        return iCustomerRepo.delete(obj);
    }


    @Override
    public Flux<Customer> findByType(String type) {
        return null;
    }

    @Override
    public Flux<Customer> findByRUC(String ruc) {
        return null;
    }

    @Override
    public Flux<Customer> findByDNI(String dni) {
        return null;
    }
}
