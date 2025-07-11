package com.tp.stream;

import java.util.Arrays;
import java.util.Comparator;

public class HigherWord {

    public static String findMax(String str) {
        String[] strings = str.split(" ");
        return Arrays.stream(strings)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
    }

    public static void main(String[] args) {
        String str = "I am learning streams api in java";
        System.out.println(findMax(str));
    }
}
