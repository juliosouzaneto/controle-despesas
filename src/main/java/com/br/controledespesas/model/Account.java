package com.br.controledespesas.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Account {

    @Id
    private Long id;
    private Client client;
    private String titulo;
    private BigDecimal saldo;

    public Account() {
    }

    public Account(String titulo, BigDecimal saldo) {
        this.titulo = titulo;
        this.saldo = saldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Client getClient() {
        return client;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", client=" + client +
                ", titulo='" + titulo + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
