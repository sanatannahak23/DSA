package com.tp.questions;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;

public class MissingElements {

    public static void find(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        int min = Arrays.stream(arr).min().orElse(0);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=min;i<=max;i++) {
            if (!contains(arr, i)) {
                list.add(i);
            }
        }
        list.stream().forEach(System.out::println);
    }

    private static boolean contains(int[] arr, int n) {

        for (int a : arr) {
            if (n == a) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        find(new int[]{4, 2, 9});
    }

}
