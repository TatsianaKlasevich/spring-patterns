package com.klasevich.spring.patterns.structural.composite;

public class SavingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}
