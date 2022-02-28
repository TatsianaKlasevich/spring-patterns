package com.klasevich.spring.patterns.structural.bridge.impl;

import com.klasevich.spring.patterns.structural.bridge.Account;
import com.klasevich.spring.patterns.structural.bridge.Bank;

public class HdfcBank extends Bank {
    public HdfcBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.print("Open your account with HDFC Bank");
        return account;
    }

}
