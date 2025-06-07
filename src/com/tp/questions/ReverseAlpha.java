package com.tp.questions;

//Write a java program to reverse only the alphabets and have the special characters in the same index of a String.
//Input : asfd$i!mn@u&
//Output : unmi$d!fs@a&

public class ReverseAlpha {
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int st = 0;
        int end = str.length() - 1;

        while (st < end) {
            while (st < end && !(chars[st] >= 'a' && chars[st] <= 'z')) {
                st++;
            }
            while (st < end && !(chars[end] >= 'a' && chars[end] <= 'z')) {
                end--;
            }

            if (st < end) {
                swap(chars, st, end);
                st++;
                end--;
            }
        }
        return new String(chars);
    }


    public static void swap(char[] arr, int st, int end) {
        char temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }


    public static void main(String[] args) {
        System.out.println(reverse("asfd$i!mn@u&"));
    }
}
