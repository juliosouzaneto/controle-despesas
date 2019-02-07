package com.br.controledespesas.service;

import com.br.controledespesas.model.Account;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

public interface ExpensesService {
    ResponseEntity<Account> getSingleExpensesResponse(Long id);

    ResponseEntity<Account> createNewExpenses(Account contact, HttpServletRequest req);

    ResponseEntity<Account> getAllExpensesResponse();

    ResponseEntity<Account> putUpdateExpenses(Long id, Account contact);
}
