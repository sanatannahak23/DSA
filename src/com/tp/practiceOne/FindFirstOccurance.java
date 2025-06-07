package com.tp.practiceOne;

//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//Example 2:
//
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.

import java.util.ArrayList;

public class FindFirstOccurance {


    public static int strStr(String haystack, String needle) {
        int size=needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            try {
                if (haystack.charAt(i) == needle.charAt(0) && haystack.substring(i,i+size).equals(needle)) {
                    return i;
                }
            } catch (Exception e) {
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
