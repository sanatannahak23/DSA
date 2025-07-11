package com.tp.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    public static int balance = 5000;

    private final Lock lock = new ReentrantLock();

    public void show() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(balance);
    }

    public void debit(int amount) {
        try {
            if (lock.tryLock(3000, TimeUnit.MICROSECONDS)) {
                try {
                    if (amount <= balance) {
                        balance -= amount;
                        Thread.sleep(5000);
                    } else {
                        System.out.println("Insufficient balance...");
                    }
                } catch (Exception e) {
                    System.out.println("Something went wrong");
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Lock is already there.");
            }
        } catch (InterruptedException e) {
            System.out.println("Some thing went wrong");
        }
    }
}
