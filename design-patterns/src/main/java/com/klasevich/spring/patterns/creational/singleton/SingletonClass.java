package com.klasevich.spring.patterns.creational.singleton;


//lazy initialization
public class SingletonClass {

    private static SingletonClass instance = null;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }
}

