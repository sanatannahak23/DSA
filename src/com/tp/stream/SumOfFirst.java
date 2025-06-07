package com.tp.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfFirst {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println(sum);

//        Optional<String> optional = Optional.of("Hello");
//        Optional<String> optional = Optional.empty();
//        String s = optional.orElse("default");
//        System.out.println(s);

//        String s = optional.orElseGet(() -> "Default");
//        System.out.println(s);

        String str = "Hello everyone";
        String data = str.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());

        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);
    }
}
