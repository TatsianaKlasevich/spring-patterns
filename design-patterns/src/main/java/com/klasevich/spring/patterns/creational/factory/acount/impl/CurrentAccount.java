package com.klasevich.spring.patterns.creational.factory.acount.impl;

import com.klasevich.spring.patterns.creational.factory.acount.Account;

public class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}
