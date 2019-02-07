package com.br.controledespesas.service;

import com.br.controledespesas.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

@Service
public class ExpensesServiceImpl implements ExpensesService{

    @Override
    public ResponseEntity<Account> getSingleExpensesResponse(Long id) {
        return new ResponseEntity<Account>(new Account("Itaú", new BigDecimal(0.2)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Account> createNewExpenses(Account contact, HttpServletRequest req) {
        return null;
    }

    @Override
    public ResponseEntity<Account> getAllExpensesResponse() {
        return null;
    }

    @Override
    public ResponseEntity<Account> putUpdateExpenses(Long id, Account contact) {
        return null;
    }

}
