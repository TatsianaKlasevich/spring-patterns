package com.klasevich.spring.patterns.structural.composite;

public class CompositePatternMain {
    public static void main(String[] args) {

        SavingAccount savingAccount1 = new SavingAccount();
        SavingAccount savingAccount2 = new SavingAccount();

        CurrentAccount currentAccount1 = new CurrentAccount();
        CurrentAccount currentAccount2 = new CurrentAccount();

        CompositeBankAccount compositeBankAccount1 = new CompositeBankAccount();
        CompositeBankAccount compositeBankAccount2 = new CompositeBankAccount();
        CompositeBankAccount compositeBankAccount = new CompositeBankAccount();

        compositeBankAccount1.add(savingAccount1);
        compositeBankAccount1.add(currentAccount1);
        compositeBankAccount2.add(currentAccount2);
        compositeBankAccount2.add(savingAccount2);
        compositeBankAccount.add(compositeBankAccount2);
        compositeBankAccount.add(compositeBankAccount1);
        compositeBankAccount.accountType();

    }
}
