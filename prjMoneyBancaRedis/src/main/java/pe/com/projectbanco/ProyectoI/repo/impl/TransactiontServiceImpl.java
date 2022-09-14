package pe.com.projectbanco.ProyectoI.repo.impl;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import pe.com.projectbanco.ProyectoI.model.Transaction;
import pe.com.projectbanco.ProyectoI.repo.IRedisCRUD;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.UUID;

@Repository
public class TransactiontServiceImpl implements IRedisCRUD {
    private static final String KEY = "transaction";
    private RedisTemplate<String, Transaction> redisTemplate;
    private HashOperations hashOperations;

    public TransactiontServiceImpl(RedisTemplate<String, Transaction> redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public Map<String, Transaction> findAll() {
        return hashOperations.entries(KEY);
    }

    @Override
    public Transaction findById(String id) {
        return (Transaction) hashOperations.get(KEY, id);
    }

    @Override
    public void save(Transaction account) {
         hashOperations.put(KEY, UUID.randomUUID().toString(), account);
    }

    @Override
    public void delete(String id) {

    }
}
