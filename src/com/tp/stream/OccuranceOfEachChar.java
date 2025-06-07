package com.tp.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfEachChar {

    public static void main(String[] args) {
        String str = "Hello world";
        Map<Character, Long> collect = str
                .chars()
                .mapToObj(value -> (char) value)
                .filter(character -> character != ' ')
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);
    }
}
