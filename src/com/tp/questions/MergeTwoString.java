package com.tp.questions;

public class MergeTwoString {

    public static String merge(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int len = Math.max(chars1.length, chars2.length);

        int i = 0;
        StringBuilder res = new StringBuilder();
        while (i < len) {
            if (chars1.length > i) res.append(chars1[i]);
            if (chars2.length > i) res.append(chars2[i]);
            i++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
//        String word1 = "abc";
//        String word2 = "pqr";
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(merge(word1, word2));
    }
}
