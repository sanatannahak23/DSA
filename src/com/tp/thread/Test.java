package com.tp.thread;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        Account account = new Account();
//        new Thread(account::show).start();
//        new Thread(account::show).start();
//
//        Map<Integer, Integer> collect = data.stream()
//                .collect(Collectors.toMap(Object::hashCode, n -> n));
        List<Integer> data = List.of(5, 8, 7, 6, 2, 3, 2);

        Map<Integer, Long> collect = data.stream()
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
        System.out.println(collect);
    }
}
