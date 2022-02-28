package com.klasevich.spring.patterns.di;


import javax.annotation.PostConstruct;

public class JdbcAccountRepository implements AccountRepository {
    @Override
    public Account findByAccountId(Long accountId) {
        return new Account(accountId, "Arnav Rajput", 3000.0);
    }

    @PostConstruct
    void populateCache() {
        System.out.println("Called populateCache() method");
    }
}
