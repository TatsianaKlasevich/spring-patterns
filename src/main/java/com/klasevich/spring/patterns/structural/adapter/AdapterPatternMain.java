package com.klasevich.spring.patterns.structural.adapter;

import com.klasevich.spring.patterns.structural.adapter.impl.AdvancedPaymentGatewayAdapter;
import com.klasevich.spring.patterns.structural.adapter.impl.PaymentGatewayImpl;

public class AdapterPatternMain {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGatewayImpl();
        AdvancedPayGateway advancedPayGateway = new AdvancedPaymentGatewayAdapter(paymentGateway);
        String mobile1 = null;
        String mobile2 = null;
        advancedPayGateway.makePayment(mobile1, mobile2);
    }
}
