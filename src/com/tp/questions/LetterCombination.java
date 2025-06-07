package com.tp.questions;

//Example 1:
//
//Input: digits = "23"
//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
//Example 2:
//
//Input: digits = ""
//Output: []
//Example 3:
//
//Input: digits = "2"
//Output: ["a","b","c"]

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {

    public static String getLetter(int n) {
        switch (n) {
            case 2 -> {
                return "abc";
            }
            case 3 -> {
                return "def";
            }
            case 4 -> {
                return "ghi";
            }
            case 5 -> {
                return "jkl";
            }
            case 6 -> {
                return "mno";
            }
            case 7 -> {
                return "pqrs";
            }
            case 8 -> {
                return "tuv";
            }
            case 9 -> {
                return "wxyz";
            }
            default -> {
                return "";
            }
        }
    }

    public static List<String> combine(String digits) {
        ArrayList<String> list = new ArrayList<>();
        if (digits.isEmpty()) {
            return list;
        } 
        String s1 = getLetter(Integer.parseInt(digits.charAt(0) + ""));
        String s2 = getLetter(Integer.parseInt(digits.charAt(1) + ""));

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                list.add("" + arr1[i] + arr2[j]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        combine("2");
    }
}
