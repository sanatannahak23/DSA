package com.tp.stream;

import java.util.stream.Collectors;

public class FilterTheNumInString {

    public static void main(String[] args) {
        String str = "Hello7ghg9u00snsdgs03837";

        String collect = str
                .chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isDigit)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(collect);
    }
}
