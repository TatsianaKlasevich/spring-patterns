package com.klasevich.spring.patterns.di;

import org.springframework.beans.factory.FactoryBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountRepositoryFactoryBean implements FactoryBean<IAccountRepository> {

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(Arrays.asList("first", "second", "third"));
        for (String number : numbers) {
            if ("third".equals(number)) {
                numbers.add("fourth");
            }
        }
        System.out.println(numbers.size());
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public IAccountRepository getObject() throws Exception {
//        return new AccountRepository();

        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return IAccountRepository.class;
    }
}

