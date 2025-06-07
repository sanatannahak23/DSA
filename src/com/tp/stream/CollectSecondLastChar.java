package com.tp.stream;

import java.util.Arrays;
import java.util.List;

public class CollectSecondLastChar {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sachin", "Dhoni", "Virat");

        List<Character> list1 = list.stream()
                .map(str -> str.charAt(str.length() - 2))
                .toList();
    }
}
