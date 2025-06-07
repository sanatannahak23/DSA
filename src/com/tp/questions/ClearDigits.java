package com.tp.questions;

public class ClearDigits {

    public static String clear(String str) {
        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                str = str.replace(str.substring(i - 1, i + 1), "");
                i = 0;
            }
            i++;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(clear("abc"));
    }
}
