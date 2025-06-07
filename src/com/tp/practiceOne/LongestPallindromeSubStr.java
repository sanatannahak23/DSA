package com.tp.practiceOne;

public class LongestPallindromeSubStr {

    public static boolean isPallindrome(String s) {
        if (s == null || s.length() <= 1) return false;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a";   // bab or aba

        String max = s.charAt(0) + "";
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (isPallindrome(substring) && substring.length() > len) {
                    max = substring;
                    len = substring.length();
                }
            }
        }
        System.out.println(max);
    }
}
