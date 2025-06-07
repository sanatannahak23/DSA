package com.tp.questions;

import java.util.Arrays;

public class LargestNum {

    public static String largestNumber(int[] nums) {
        String[] array = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b)); // soring in descending order
        if (array[0].equals("0")) return "0";
        StringBuilder res = new StringBuilder();
        for (String str : array) res.append(str);
        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums={3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
}
