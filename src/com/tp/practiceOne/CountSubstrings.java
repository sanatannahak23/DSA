package com.tp.practiceOne;

public class CountSubstrings {

    public static int subStrings(String str) {
        return str.length() * (str.length() - 1) / 2;
    }
}
