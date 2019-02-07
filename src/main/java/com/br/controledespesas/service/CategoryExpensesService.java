package com.br.controledespesas.service;

import com.br.controledespesas.model.Account;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

public interface CategoryExpensesService {
    ResponseEntity<Account> getSingleCategoryExpensesResponse(Long id);

    ResponseEntity<Account> createNewCategoryExpenses(Account contact, HttpServletRequest req);

    ResponseEntity<Account> getAllCategoryExpensesResponse();

    ResponseEntity<Account> putUpdateCategoryExpenses(Long id, Account contact);
}
