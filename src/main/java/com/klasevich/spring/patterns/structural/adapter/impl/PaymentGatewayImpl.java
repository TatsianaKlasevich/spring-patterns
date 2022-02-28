package com.klasevich.spring.patterns.structural.adapter.impl;

import com.klasevich.spring.patterns.creational.factory.acount.Account;
import com.klasevich.spring.patterns.structural.adapter.PaymentGateway;

public class PaymentGatewayImpl implements PaymentGateway {

    @Override
    public void doPayment(Account account1, Account account2) {
        System.out.println("Do payment using Payment Gateway");
    }
}
