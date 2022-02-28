package com.klasevich.spring.patterns.creational.prototype;

public class CurrentAccount extends Account {
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}
