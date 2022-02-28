package com.klasevich.spring.patterns.creational.prototype;

public class SavingAccount extends Account {

    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}
