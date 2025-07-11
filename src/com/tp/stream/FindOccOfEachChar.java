package com.tp.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class FindOccOfEachChar {

    public static Map<Character, Long> find(String str) {
        return str
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));
    }

    public static void main(String[] args) {
        System.out.println(find("Mississippi"));
    }
}
