package com.tp.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Java Program - I have list of numbers from which
i) You need to return the numbers which are repeated odd number of times 10,20,20,10,30,40,50,50
ii) You need to return the numbers which starts with 1
 */
public class FilterAndReturn {

    public static void find(List<Integer> list) {
        HashMap<Integer, Long> collect = list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .filter(entry -> entry.getKey().toString().startsWith("1"))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (_, o2) -> o2,
                        HashMap::new));
        System.out.println(collect);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 20, 10, 30, 40, 50, 50);
        find(list);
    }
}
