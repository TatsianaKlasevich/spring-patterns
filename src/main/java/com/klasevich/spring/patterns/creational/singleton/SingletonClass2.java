package com.klasevich.spring.patterns.creational.singleton;

public class SingletonClass2 {

    private static final SingletonClass2 INSTANCE = new SingletonClass2();

    private SingletonClass2() {
    }

    public static SingletonClass2 getInstance() {
        return INSTANCE;
    }
}
