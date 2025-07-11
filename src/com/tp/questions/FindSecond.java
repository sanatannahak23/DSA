package com.tp.questions;


import java.util.LinkedHashMap;
import java.util.Map;

//Find the second non repeating element
public class FindSecond {

    public static int find(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return map
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst()
                .orElse(0);
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 5, 3, 7, 6, 2};

        System.out.println(find(arr));
    }
}
