package com.br.controledespesas.service;

import com.br.controledespesas.model.Account;
import com.br.controledespesas.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public ResponseEntity<Account> getSingleAccountResponse(Long id) {
        return new ResponseEntity<Account>(new Account("Itaú", new BigDecimal(0.2)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Account> createNewAccount(Account contact, HttpServletRequest req) {
        accountRepository.save(contact);
        Account account = accountRepository.findByTitulo(contact.getTitulo());
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Account>> getAllAccountsResponse() {
        List<Account> all = accountRepository.findAll();
        return new ResponseEntity<List<Account>>(all, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Account> putUpdateAccount(Long id, Account contact) {
        return null;
    }

}
