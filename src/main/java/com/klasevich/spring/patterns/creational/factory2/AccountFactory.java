package com.klasevich.spring.patterns.creational.factory2;

import com.klasevich.spring.patterns.creational.factory.acount.Account;
import com.klasevich.spring.patterns.creational.factory.acount.impl.CurrentAccount;
import com.klasevich.spring.patterns.creational.factory.acount.impl.SavingAccount;
import com.klasevich.spring.patterns.creational.factory2.entity.Bank;

public class AccountFactory extends AbstractFactory {

    final String CURRENT_ACCOUNT = "CURRENT";
    final String SAVING_ACCOUNT = "SAVING";

    public Account getAccount(String accountType) {
        if (CURRENT_ACCOUNT.equals(accountType)) {
            return new CurrentAccount();
        } else if (SAVING_ACCOUNT.equals(accountType)) {
            return new SavingAccount();
        }
        return null;
    }

    @Override
    Bank getBank(String bankName) {
        return null;
    }
}
