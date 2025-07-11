package com.tp.stream;

import java.util.stream.IntStream;

public class EvenBetween {

    public static void main(String[] args) {
        IntStream.range(1, 51)
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);
    }
}
