package com.klasevich.spring.patterns.structural.bridge.impl;

import com.klasevich.spring.patterns.structural.bridge.Account;

public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("OPENED: SAVING ACCOUNT");
        return new SavingAccount();
    }

    @Override
    public void accountType() {
        System.out.println("##It is a SAVING Account##");
    }
}
