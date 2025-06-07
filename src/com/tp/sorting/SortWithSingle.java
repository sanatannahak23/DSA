package com.tp.sorting;

import java.util.TreeSet;

public class SortWithSingle {

    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        int[] arr = {5, 8, 3, 2, 9, 6};

        for (int n : arr) {
            integers.add(n);
        }
        System.out.println(integers);
    }
}
