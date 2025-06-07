package com.tp.questions;

import java.util.*;

public class FrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> entries = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            entries.add(m);
            if (entries.size() > k) {
                entries.poll();
            }
        }
        return entries
                .stream()
                .map(Map.Entry::getKey)
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 0};
        int k = 1;  // number of highest elements
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }
}
