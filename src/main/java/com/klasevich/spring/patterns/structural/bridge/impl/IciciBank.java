package com.klasevich.spring.patterns.structural.bridge.impl;

import com.klasevich.spring.patterns.structural.bridge.Account;
import com.klasevich.spring.patterns.structural.bridge.Bank;

public class IciciBank extends Bank {
    public IciciBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("Open your account with ICICI Bank");
        return account;
    }

}
