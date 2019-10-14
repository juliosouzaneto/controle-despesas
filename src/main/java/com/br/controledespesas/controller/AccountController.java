package com.br.controledespesas.controller;


import com.br.controledespesas.model.Account;
import com.br.controledespesas.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/controle-despesassss/")
public class AccountController {

    @Autowired
    private AccountService accountService;


    /**
     * List All Contacts
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "contas", method = RequestMethod.GET)
    public ResponseEntity<List<Account>> getAllAccounts()  throws Throwable {
        return accountService.getAllAccountsResponse();
    }


    /**
     * List One Account
     * @param id
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "contas/{id}", method = RequestMethod.GET)
    public ResponseEntity<Account> getSingleAccount(@PathVariable long id)  throws Throwable {

        return accountService.getSingleAccountResponse(id);
    }

    /**
     * Create New Acconut
     * @param account
     * @param req
     * @return
     */
    @RequestMapping(value = "contas", method = RequestMethod.POST)
    public ResponseEntity<Account> createNewContact(@RequestBody Account account, HttpServletRequest req) {
        return accountService.createNewAccount(account, req);
    }


    /**
     * Update Account with PUT
     * @param id
     * @param contact
     * @return
     */
    @RequestMapping(value = "contas/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Account> putUpdateContact(@PathVariable Long id, @RequestBody Account contact) {
        return accountService.putUpdateAccount(id, contact);
    }
}
