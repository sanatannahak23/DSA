package com.tp.practiceOne;

import java.util.*;

//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class LongestSubStrWithoutRepeatChar {

    public static boolean checkRepeat(String s) {
        HashSet<Character> chars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }
        return s.length() == chars.size();
    }

    public static void main(String[] args) {
        String s = "anviaj";    // abc

        String max = s.charAt(0) + "";
        int len = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (checkRepeat(substring)) {
                    max = substring;
                } else break;
            }
            if (len < max.length()) len = max.length();
        }
        System.out.println(len);
        System.out.println(max);
    }
}
