package com.br.controledespesas.repository;

import com.br.controledespesas.model.Account;
import com.br.controledespesas.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AccountRepository  extends MongoRepository<Account, String> {
    public Account findByTitulo(String firstName);
    public List<Account> findByClient(Client client);

}
