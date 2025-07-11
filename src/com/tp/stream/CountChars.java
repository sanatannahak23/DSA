package com.tp.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChars {

    public static void main(String[] args) {
        String s = "this is ravi";
//        long count = s.chars()
//                .mapToObj(c -> (char) c)
//                .count();
//        System.out.println(count);
//
//        List<String> list = List.of("black", "red", "white", "blue");
//        list.stream()
//                .sorted(String::compareTo)
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);

//        Arrays.stream(s.split(" "))
//                .map(s1 -> new StringBuilder(" " + s1))
//                .map(StringBuilder::reverse)
//                .toList()
//                .forEach(System.out::print);

        List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);

    }
}
