package pe.com.projectbanco.ProyectoI.repo;

import pe.com.projectbanco.ProyectoI.model.Transaction;

import java.util.Map;

public interface IRedisCRUD {

    Map<String, Transaction> findAll();
    Transaction findById(String id);
    void save(Transaction account);
    void delete(String id);
}
