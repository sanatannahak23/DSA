package com.tp.practiceOne;

//8.Program 1 3 7 0 2 1 sum=10; count=1;

import java.util.HashSet;

public class ContOfSum {

    public static int count(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    set.add(arr[i]);
                    set.add(arr[j]);
                }
            }
        }
        return set.size() % 2 != 0 ? (set.size() + 1) / 2 : set.size() / 2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 0, 2, 1};
        int sum = 10;
        System.out.println(count(arr, sum));
    }
}
