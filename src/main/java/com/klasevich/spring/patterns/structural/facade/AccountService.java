package com.klasevich.spring.patterns.structural.facade;

import com.klasevich.spring.patterns.structural.decorator.Account;
import com.klasevich.spring.patterns.structural.decorator.SavingAccount;

public class AccountService {
    public static Account getAccount(String accountId) {
        return new SavingAccount();
    }
}
