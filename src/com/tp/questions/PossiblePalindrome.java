package com.tp.questions;

//Example 1:
//
//Input: s = "aab"
//Output: [["a","a","b"],["aa","b"]]
//Example 2:
//
//Input: s = "a"
//Output: [["a"]]

import java.util.ArrayList;
import java.util.List;

public class PossiblePalindrome {

    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            if (chars[i] != chars[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static List<List<String>> partition(String s) {
        ArrayList<List<String>> lists = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            ArrayList<String> list = new ArrayList<>();
            if (i == s.length() - 1) {
                list.add(s.charAt(i) + "");
                lists.add(list);
                continue;
            }
            for (int j = i + 1; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (isPalindrome(substring)) list.add(substring);
            }
            if (!list.isEmpty()) lists.add(list);
        }
        System.out.println(lists);
        return null;
    }

    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }
}
