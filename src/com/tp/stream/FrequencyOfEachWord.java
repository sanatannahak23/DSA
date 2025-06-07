package com.tp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachWord {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");

        Map<String, Long> collect = words
                .stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);
    }
}
