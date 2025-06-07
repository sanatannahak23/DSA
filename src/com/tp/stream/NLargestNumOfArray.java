package com.tp.stream;

import java.util.Arrays;

public class NLargestNumOfArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};

        int i = Arrays.stream(arr)
                .sorted()
                .distinct()
                .skip(2)
                .findFirst()
                .orElse(0);
        System.out.println(i);
    }
}
