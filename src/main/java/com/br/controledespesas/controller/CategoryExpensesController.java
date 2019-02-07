package com.br.controledespesas.controller;


import com.br.controledespesas.model.Account;
import com.br.controledespesas.service.CategoryExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/controle-despesas/category/")
public class CategoryExpensesController {

    @Autowired
    private CategoryExpensesService categoryExpensesService;


    /**
     * List All Contacts
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "expenses", method = RequestMethod.GET)
    public ResponseEntity<Account> getAllAccounts()  throws Throwable {

        return categoryExpensesService.getAllCategoryExpensesResponse();
    }


    /**
     * List One Account
     * @param id
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "expenses/{id}", method = RequestMethod.GET)
    public ResponseEntity<Account> getSingleAccount(@PathVariable long id)  throws Throwable {

        return categoryExpensesService.getSingleCategoryExpensesResponse(id);
    }

    /**
     * Create New Acconut
     * @param account
     * @param req
     * @return
     */
    @RequestMapping(value = "expenses", method = RequestMethod.POST)
    public ResponseEntity<Account> createNewContact(@RequestBody Account account, HttpServletRequest req) {
        return categoryExpensesService.createNewCategoryExpenses(account, req);
    }


    /**
     * Update Account with PUT
     * @param id
     * @param contact
     * @return
     */
    @RequestMapping(value = "expenses/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Account> putUpdateContact(@PathVariable Long id, @RequestBody Account contact) {
        return categoryExpensesService.putUpdateCategoryExpenses(id, contact);
    }
}
