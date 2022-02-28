package com.klasevich.spring.patterns.creational.factory;

import com.klasevich.spring.patterns.creational.factory.acount.Account;

public class FactoryPatternMain {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.accountType();
        Account currentAccount = accountFactory.getAccount("CURRENT");
        currentAccount.accountType();
    }
}
