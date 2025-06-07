package com.tp.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCharByFreq {

    public static String frequencySort(String s) {
        LinkedHashMap<Character, Long> collect = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(value -> value, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (aLong, aLong2) -> aLong,
                        LinkedHashMap::new));
        StringBuilder res = new StringBuilder();
        collect.keySet()
                .stream()
                .forEach(v -> {
                    Long l = collect.get(v);
                    for (int i = 0; i < l; i++) {
                        res.append(v);
                    }
                });
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
