package com.klasevich.spring.patterns.di;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    public TransferService transferService() throws Exception {
        return new TransferService(accountRepository().getObject());
    }

    @Bean
    public AccountRepositoryFactoryBean accountRepository() {
        return new AccountRepositoryFactoryBean();
    }
}
