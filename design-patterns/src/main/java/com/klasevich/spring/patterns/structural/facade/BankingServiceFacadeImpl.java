package com.klasevich.spring.patterns.structural.facade;

import com.klasevich.spring.patterns.structural.decorator.Account;

public class BankingServiceFacadeImpl implements BankingServiceFacade {
    @Override
    public void moneyTransfer() {
        if (PaymentService.doPayment()) {
            Account fromAccount = AccountService.getAccount("1");
            Account toAccount = AccountService.getAccount("2");
            TransferService.transfer(1000, fromAccount, toAccount);

        }
    }
}
