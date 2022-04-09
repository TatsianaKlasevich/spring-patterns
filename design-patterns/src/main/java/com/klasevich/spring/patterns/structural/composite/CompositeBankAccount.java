package com.klasevich.spring.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeBankAccount implements Account {
    private List<Account> childAccounts = new ArrayList<Account>();

    @Override
    public void accountType() {
        for (Account account : childAccounts) {
            account.accountType();
        }
    }

    public void add(Account account) {
        childAccounts.add(account);
    }

    public void remove(Account account) {
        childAccounts.remove(account);
    }
}
