package com.klasevich.spring.patterns.structural.adapter.impl;

import com.klasevich.spring.patterns.creational.factory.acount.Account;
import com.klasevich.spring.patterns.structural.adapter.AdvancedPayGateway;
import com.klasevich.spring.patterns.structural.adapter.PaymentGateway;

public class AdvancedPaymentGatewayAdapter implements AdvancedPayGateway {

    private PaymentGateway paymentGateway;

    public AdvancedPaymentGatewayAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(String mobile1, String mobile2) {
        Account account1 = null;
        Account account2 = null;
        paymentGateway.doPayment(account1, account2);
    }
}
