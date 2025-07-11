package com.tp.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstRepeative {

    public static char find(String str) {
        return str
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(
                        character -> character,
                        _ -> 1L,
                        Long::sum,
                        LinkedHashMap::new))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    public static boolean isAlpha(char c) {
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int i = 0, j = str.length() - 1;

        while (i < j) {
            while (i < j && !isAlpha(str.charAt(i))) {
                i++;
            }
            while (i < j && !isAlpha(str.charAt(j))) {
                j--;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
//        System.out.println(find("Hello world"));
        System.out.println(reverse("ab$cd#e"));
    }
}
