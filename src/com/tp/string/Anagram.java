package com.tp.string;

public class Anagram {

    public static Boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        while (!s1.isEmpty()) {
            char c = s1.charAt(0);
            s1 = s1.replace(c + "", "");
            s2 = s2.replace(c + "", "");
            if (s1.length() != s2.length()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "lisoen";

        System.out.println(isAnagram(s1, s2));
    }
}
