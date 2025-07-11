package com.tp.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindVowlContString {

    public static boolean isVowl(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static List<String> find(String str) {
        return Arrays.stream(str.split(" "))
                .collect(Collectors.toMap(s -> s,
                        o -> o.chars()
                                .mapToObj(c -> (char) c)
                                .filter(FindVowlContString::isVowl)
                                .count(),
                        (o, _) -> o,
                        HashMap::new))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() == 2)
                .map(Map.Entry::getKey)
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(find("I am learning stream api in java"));
    }
}
