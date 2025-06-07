package com.tp.practiceOne;

import java.security.Signature;

public class SingletonClass {
    private SingletonClass() {
    }

    private static SingletonClass singletonClass;

    public static SingletonClass getSingletonClass() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public static void main(String[] args) {
        System.out.println(getSingletonClass());
        System.out.println(getSingletonClass());
    }
}
