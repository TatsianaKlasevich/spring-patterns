package com.klasevich.spring.patterns.creational.prototype;

public class PrototypePatternMain {
    public static void main(String[] args) {
        Account currentAccount = (Account) AccountCache.accountCacheMap.get("CURRENT").clone();
        Account savingAccount = (Account) AccountCache.accountCacheMap.get("SAVING").clone();

    }
}
