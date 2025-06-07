package com.tp.practiceOne;

public class Devided {

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));
    }
}
