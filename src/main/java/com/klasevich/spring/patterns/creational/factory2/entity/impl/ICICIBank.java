package com.klasevich.spring.patterns.creational.factory2.entity.impl;

import com.klasevich.spring.patterns.creational.factory2.entity.Bank;

public class ICICIBank implements Bank {
    @Override
    public void bankName() {
        System.out.println("ICICI Bank Ltd.");
    }
}
