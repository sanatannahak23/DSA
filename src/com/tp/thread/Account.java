package com.tp.thread;

public class Account {

    private static int balance = 5000;

    public void show() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(balance);
    }
}
