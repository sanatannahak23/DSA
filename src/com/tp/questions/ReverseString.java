package com.tp.questions;

public class ReverseString {

    public static String reverse(String str) {
        char[] array = str.toCharArray();
        int i, j;
        for (i = 0, j = array.length - 1; i <= j; i++, j--) {
            char c = array[i];
            array[i] = array[j];
            array[j] = c;
        }
        return new String(array);
    }

    public static void main(String[] args) {
        System.out.println(reverse("sanatanNahak"));
    }
}
