package com.tp.stream;

public class FirstNonRepeatChar {

    public static char find(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(find("Hello world"));
    }
}
