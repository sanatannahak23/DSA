package com.tp.string;

public class Permutation {

    public static String swap(String s, int st, int end) {
        char[] a = s.toCharArray();
        char temp = a[st];
        a[st] = a[end];
        a[end] = temp;
        return new String(a);
    }

    public static void permutation(String s, int st, int end) {
        if (st == end) {
            System.out.println(s);
            return;
        }

        for (int i = st; i <= end; i++) {
            String s2 = swap(s, st, i);
            permutation(s2, st + 1, end);
        }
    }

    public static void main(String[] args) {
        String s="abc";

        permutation(s,0,s.length()-1);
    }
}
