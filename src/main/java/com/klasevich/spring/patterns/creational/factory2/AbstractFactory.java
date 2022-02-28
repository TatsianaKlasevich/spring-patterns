package com.klasevich.spring.patterns.creational.factory2;

import com.klasevich.spring.patterns.creational.factory.acount.Account;
import com.klasevich.spring.patterns.creational.factory2.entity.Bank;

public abstract class AbstractFactory {
    abstract Bank getBank(String bankName);

    abstract Account getAccount(String accountType);
}
