package com.br.controledespesas.model;

import java.math.BigDecimal;
import java.util.Date;

public class Expense {

    private BigDecimal value;
    private Date data;
    private String description;
    private CategoryExpense categoryExpense;
    private Account account;
    private boolean paid;


    public Expense() {
    }

    public Expense(BigDecimal value, Date data, String description, CategoryExpense categoryExpense, Account account, boolean paid) {
        this.value = value;
        this.data = data;
        this.description = description;
        this.categoryExpense = categoryExpense;
        this.account = account;
        this.paid = paid;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Date getData() {
        return data;
    }

    public String getDescription() {
        return description;
    }

    public CategoryExpense getCategoryExpense() {
        return categoryExpense;
    }

    public Account getAccount() {
        return account;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "value=" + value +
                ", data=" + data +
                ", description='" + description + '\'' +
                ", categoryExpense=" + categoryExpense +
                ", account=" + account +
                ", paid=" + paid +
                '}';
    }
}
