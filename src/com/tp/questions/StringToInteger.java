package com.tp.questions;

public class StringToInteger {

    public static int res(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int res = 0;
        int i = 0;
        int sign = 1;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int n = s.charAt(i) - '0';
            res = (res * 10) + n;

            if (res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return res * sign;
    }

    public static void main(String[] args) {
        System.out.println(res("-042"));
    }
}
