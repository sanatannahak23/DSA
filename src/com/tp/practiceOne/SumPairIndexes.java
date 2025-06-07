package com.tp.practiceOne;

import java.util.*;

public class SumPairIndexes {

    public static Collection<Integer> find(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    set.add(i);
                    set.add(j);
                }
            }
            if (!set.isEmpty()) break;
        }

        return set;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 11, 15};
        int target = 4;

        System.out.println(find(arr, target));
    }
}
