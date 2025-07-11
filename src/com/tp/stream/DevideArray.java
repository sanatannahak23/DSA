package com.tp.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DevideArray {

    public static List<List<Integer>> devide(List<Integer> list) {
        return list
                .stream()
                .collect(Collectors.partitioningBy(integer -> integer % 2 == 0))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(devide(List.of(1,2,3,4,5,6,7,8)));
    }
}
