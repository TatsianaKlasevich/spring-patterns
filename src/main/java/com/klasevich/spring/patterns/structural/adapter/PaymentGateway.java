package com.klasevich.spring.patterns.structural.adapter;

import com.klasevich.spring.patterns.creational.factory.acount.Account;

public interface PaymentGateway {
    void doPayment(Account account1, Account account2);
}
