package com.tp.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Test {

    public static void main(String[] args) {
//        Account account = new Account();
//        new Thread(account::show).start();
//        new Thread(account::show).start();
//
//        Map<Integer, Integer> collect = data.stream()
//                .collect(Collectors.toMap(Object::hashCode, n -> n));
//        List<Integer> data = List.of(5, 8, 7, 6, 2, 3, 2);
//
//        Map<Integer, Long> collect = data.stream()
//                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
//        System.out.println(collect);

//        Account account = new Account();
//        Thread t1 = new Thread(() -> account.debit(500), "Thread1");
//        Thread t2 = new Thread(() -> account.debit(500), "Thread2");
//
//        t1.start();
//        t2.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(account.balance);

//        ReentrantExample reentrantExample = new ReentrantExample();
//        reentrantExample.outerMethod();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(9);
        for (int i = 0; i < 10; i++) {
        }
    }
}
