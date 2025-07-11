package com.tp.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeat {

    public static int find(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return map
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() <= 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 5, 4, 3, 5, 8, 2, 1, 0, 0}));
    }
}
