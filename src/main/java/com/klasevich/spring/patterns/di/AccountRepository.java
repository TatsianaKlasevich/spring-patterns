package com.klasevich.spring.patterns.di;

public interface AccountRepository {
    Account findByAccountId(Long accountId);
}
