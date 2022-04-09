package com.klasevich.spring.patterns.structural.bridge.impl;

import com.klasevich.spring.patterns.structural.bridge.Account;

public class CurrentAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("OPENED: CURRENT ACCOUNT");
        return new CurrentAccount();
    }

    @Override
    public void accountType() {
        System.out.println("##It is a CURRENT Account##");

    }
}
