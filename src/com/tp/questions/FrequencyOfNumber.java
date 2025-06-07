package com.tp.questions;

//Input: nums = [1,1,1,2,2,3], k = 2 → Output: [1, 2]
//Input: nums = [4,4,1,1,2,2,2,3,3], k = 2 → Output: [2, 4]

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfNumber {

    public static List<Integer> higher(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        HashMap<Integer, Integer> res = new HashMap<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            res.put(e.getValue(), e.getKey());
        }
        return res.values().stream().sorted().limit(2).toList();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        System.out.println(higher(arr));
    }
}
