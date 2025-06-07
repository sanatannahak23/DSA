package com.tp.questions;

public class LargestSubStr {

    public static int largestSub(String s) {
        long n = s.chars().mapToObj(c -> (char) c).distinct().count();
        long curr = n / 2;
        long max = curr;

        return (int) max;
    }

    public static void main(String[] args) {
        System.out.println(largestSub("abcabcbb"));
    }
}
