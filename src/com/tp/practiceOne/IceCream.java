package com.tp.practiceOne;

import java.util.Arrays;

public class IceCream {

    public static int check(int[] arr) {
        double avg = Arrays.stream(arr).average().orElse(0);
        int n = (int) avg;
        int size = Double.toString(avg - n).substring(2).length();
        return size > 2 ? -1 : (int) avg;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(check(arr));
    }
}
