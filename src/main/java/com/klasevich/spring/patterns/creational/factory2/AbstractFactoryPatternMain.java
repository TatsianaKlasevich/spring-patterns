package com.klasevich.spring.patterns.creational.factory2;


import com.klasevich.spring.patterns.creational.factory.acount.Account;
import com.klasevich.spring.patterns.creational.factory2.entity.Bank;

public class AbstractFactoryPatternMain {
    public static void main(String[] args) {
        AbstractFactory accountFactory = FactoryProducer.getFactory("ACCOUNT");
        Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.accountType();
        Account currentAccount = accountFactory.getAccount("CURRENT");
        currentAccount.accountType();
        AbstractFactory bankFactory = FactoryProducer.getFactory("BANK");
        Bank iciciBank = bankFactory.getBank("ICICI");
        iciciBank.bankName();
        Bank yesBank = bankFactory.getBank("YES");
        yesBank.bankName();

    }
}
