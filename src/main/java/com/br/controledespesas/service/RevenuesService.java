package com.br.controledespesas.service;

import com.br.controledespesas.model.Account;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

public interface RevenuesService {
    ResponseEntity<Account> getSingleRevenuesResponse(Long id);

    ResponseEntity<Account> createNewRevenuesResponse(Account contact, HttpServletRequest req);

    ResponseEntity<Account> getAllRevenuesResponse();

    ResponseEntity<Account> putUpdateRevenuesResponse(Long id, Account contact);
}
