package com.klasevich.spring.patterns.structural.proxy;

public class SavingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}
