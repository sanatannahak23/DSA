package com.tp.stream;

import java.util.stream.Collectors;

public class RemveDuplicateFromStr {

    public static String remove(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(remove("dabcadefg"));
    }
}
