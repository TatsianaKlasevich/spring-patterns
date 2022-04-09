package com.klasevich.spring.patterns.creational.factory2;

import com.klasevich.spring.patterns.creational.factory.acount.Account;
import com.klasevich.spring.patterns.creational.factory2.entity.Bank;
import com.klasevich.spring.patterns.creational.factory2.entity.impl.ICICIBank;
import com.klasevich.spring.patterns.creational.factory2.entity.impl.YesBank;

public class BankFactory extends AbstractFactory {
    final String ICICI_BANK = "ICICI";
    final String YES_BANK = "YES";

    @Override
    Bank getBank(String bankName) {
        if (ICICI_BANK.equalsIgnoreCase(bankName)) {
            return new ICICIBank();
        } else if (YES_BANK.equalsIgnoreCase(bankName)) {
            return new YesBank();
        }
        return null;
    }

    @Override
    Account getAccount(String accountType) {
        return null;
    }
}
