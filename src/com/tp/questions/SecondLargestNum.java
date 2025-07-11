package com.tp.questions;

import java.util.Arrays;

public class SecondLargestNum {

    public static int findSecondUsingStream(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .sorted()
                .skip(arr.length-2)
                .findFirst()
                .orElseThrow(()->new RuntimeException("Invalid"));
    }

    public static int findSecond(int[] arr) {
        int s1 = 0, s2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s2) continue;
            if (arr[i] > s1) {
                s2 = s1;
                s1 = arr[i];
            } else if (arr[i] > s2) s2 = arr[i];
        }
        return s2;
    }

    public static void main(String[] args) {
        int[] ints = {2, 5, 8, 6, 7, 8, 9, 9, 10, 22, 9, 10};
        System.out.println(findSecondUsingStream(ints));
    }
}
