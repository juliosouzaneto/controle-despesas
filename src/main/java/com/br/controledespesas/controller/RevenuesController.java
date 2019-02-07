package com.br.controledespesas.controller;


import com.br.controledespesas.model.Account;
import com.br.controledespesas.service.RevenuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/controle-despesas/")
public class RevenuesController {

    @Autowired
    private RevenuesService revenuesService;


    /**
     * List All Contacts
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "revenues", method = RequestMethod.GET)
    public ResponseEntity<Account> getAllRevenues()  throws Throwable {

        return revenuesService.getAllRevenuesResponse();
    }


    /**
     * List One Account
     * @param id
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "revenues/{id}", method = RequestMethod.GET)
    public ResponseEntity<Account> getSingleRevenues(@PathVariable long id)  throws Throwable {

        return revenuesService.getSingleRevenuesResponse(id);
    }

    /**
     * Create New Acconut
     * @param account
     * @param req
     * @return
     */
    @RequestMapping(value = "revenues", method = RequestMethod.POST)
    public ResponseEntity<Account> createNewRevenues(@RequestBody Account account, HttpServletRequest req) {
        return revenuesService.createNewRevenuesResponse(account, req);
    }


    /**
     * Update Account with PUT
     * @param id
     * @param contact
     * @return
     */
    @RequestMapping(value = "revenues/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Account> putUpdateRevenues(@PathVariable Long id, @RequestBody Account contact) {
        return revenuesService.putUpdateRevenuesResponse(id, contact);
    }
}
