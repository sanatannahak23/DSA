package com.tp.practiceOne;

public class StringPermutation {

    public static String swap(String str, int st, int end) {
        char[] arr = str.toCharArray();
        char temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
        return new String(arr);
    }

    public static void permutation(String s, int st, int end) {
        if (st == end) {
            System.out.println(s);
            return;
        }
        for (int i = st; i < end; i++) {
            String swap = swap(s, st, i);
            permutation(swap, st + 1, end);
        }
    }

    public static void main(String[] args) {
        permutation("abcde", 0, 5);
    }
}
