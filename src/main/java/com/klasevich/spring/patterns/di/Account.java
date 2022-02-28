package com.klasevich.spring.patterns.di;

public class Account {
    private Long id;
    private String name;
    private double amount;

    public Account(Long id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
}
