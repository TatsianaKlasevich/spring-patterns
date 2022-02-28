package com.klasevich.spring.patterns.creational.builder;

public class Account {

    private String accountName;
    private Long accountNumber;
    private String accountHolder;
    private double balance;
    private String type;
    private double interest;

    Account(AccountBuilder accountBuilder) {
        super();
        this.accountName = accountBuilder.accountName;
        this.accountNumber = accountBuilder.accountNumber;
        this.accountHolder = accountBuilder.accountHolder;
        this.balance = accountBuilder.balance;
        this.type = accountBuilder.type;
        this.interest = accountBuilder.interest;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", interest=" + interest +
                '}';
    }

    public static class AccountBuilder {
        private final String accountName;
        private final Long accountNumber;
        private final String accountHolder;
        private double balance;
        private String type;
        private double interest;

        public AccountBuilder(String accountName, String accountHolder, Long accountNumber) {
            this.accountName = accountName;
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
        }

        public AccountBuilder balance(double balance) {
            this.balance = balance;
            return this;
        }

        public AccountBuilder type(String type) {
            this.type = type;
            return this;
        }

        public AccountBuilder interest(double interest) {
            this.interest = interest;
            return this;
        }

        public Account build() {
            Account user = new Account(this);
            return user;
        }
    }
}
