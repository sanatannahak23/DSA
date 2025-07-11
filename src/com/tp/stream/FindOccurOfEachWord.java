package com.tp.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurOfEachWord {

    public static Map<String, Long> find(String str) {
        return Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
    }

    public static void main(String[] args) {
        System.out.println(find("i am learning streams api in java java"));
    }
}
