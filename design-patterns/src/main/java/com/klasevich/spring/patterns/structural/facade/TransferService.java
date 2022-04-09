package com.klasevich.spring.patterns.structural.facade;

import com.klasevich.spring.patterns.structural.decorator.Account;

public class TransferService {
    public static void transfer(int amount, Account fromAccount, Account toAccount) {
        System.out.println("Transfering Money");
    }
}
