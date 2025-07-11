package com.tp.string;

public class PermutationPractice {

    private static String swap(String s, int st, int end) {
        char[] chars = s.toCharArray();
        char c = chars[st];
        chars[st] = chars[end];
        chars[end] = c;
        return new String(chars);
    }

    public static void permutation(String s, int st, int end) {
        if (st == end) {
            System.out.println(s);
            return;
        }
        for (int i = st; i <= end; i++) {
            String swaped = swap(s, st, i);
            permutation(swaped, st + 1, end);
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        permutation(s,0,s.length()-1);
    }
}
