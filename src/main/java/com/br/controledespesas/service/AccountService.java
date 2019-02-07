package com.br.controledespesas.service;

import com.br.controledespesas.model.Account;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface AccountService {
    ResponseEntity<Account> getSingleAccountResponse(Long id);

    ResponseEntity<Account> createNewAccount(Account contact, HttpServletRequest req);

    ResponseEntity<List<Account>> getAllAccountsResponse();

    ResponseEntity<Account> putUpdateAccount(Long id, Account contact);
}
