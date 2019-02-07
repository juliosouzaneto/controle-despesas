package com.br.controledespesas.service;

import com.br.controledespesas.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

@Service
public class RevenuesServiceImpl implements RevenuesService{

    @Override
    public ResponseEntity<Account> getSingleRevenuesResponse(Long id) {
        return new ResponseEntity<Account>(new Account("Itaú", new BigDecimal(0.2)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Account> createNewRevenuesResponse(Account contact, HttpServletRequest req) {
        return null;
    }

    @Override
    public ResponseEntity<Account> getAllRevenuesResponse() {
        return null;
    }

    @Override
    public ResponseEntity<Account> putUpdateRevenuesResponse(Long id, Account contact) {
        return null;
    }

}
