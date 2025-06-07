package com.tp.practiceOne;

import java.util.*;

public class LestLongestPallindrome {

    public static boolean isPallindrome(String str) {
        int i, j;

        for (i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "rppp";
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String substring = str.substring(i, j + 1);
                if (isPallindrome(substring)) map.put(substring.length(), substring);
            }
        }
        Set<Integer> integers = map.keySet();
        System.out.println(map.get(Collections.max(integers)));
    }
}
