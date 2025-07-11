package com.tp.stream;

import java.util.Arrays;
import java.util.Comparator;

public class FiindSecondHigher {

    public static String seconde(String str) {
        return Arrays.stream(str.split(" "))
                .sorted(Comparator.comparingInt(String::length).reversed())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    public static Integer secondLen(String str) {
        return Arrays.stream(str.split(" "))
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(secondLen("I am learning streams api in java"));


    }
}
