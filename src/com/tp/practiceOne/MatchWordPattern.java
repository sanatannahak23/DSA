package com.tp.practiceOne;

//Example 1:
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Explanation:
//The bijection can be established as:
//        'a' maps to "dog".
//        'b' maps to "cat".
//Example 2:
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
//Example 3:
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MatchWordPattern {

    public static boolean match(Map<String, Character> map, String[] string, char[] charArray) {
        for (int i = 0; i < string.length; i++) {
            if (map.get(string[i]) != charArray[i]) return false;
        }
        return true;
    }

    public static boolean wordPattern(String pattern, String s) {
        char[] charArray = pattern.toCharArray();
        String[] strings = s.split(" ");
        if (charArray.length != strings.length) return false;
        if (strings.length == 1) return true;

        Map<String, Character> data = new HashMap<>();
        HashSet<Character> val = new HashSet<>();
        for (int i = 0; i < charArray.length; i++) {
            data.put(strings[i], charArray[i]);
            val.add(charArray[i]);
        }

        if (data.values().size() != val.size()) return false;
        if (data.size() != charArray.length / 2) return false;
        return match(data,strings,charArray);
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("aaaa", "dog cat cat fish"));
    }
}
