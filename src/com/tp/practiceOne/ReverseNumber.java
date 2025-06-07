package com.tp.practiceOne;

//Example 1:
//
//Input: x = 123
//Output: 321
//Example 2:
//
//Input: x = -123
//Output: -321
//Example 3:
//
//Input: x = 120
//Output: 21

public class ReverseNumber {

    public static int reverse(int x) {
        int sum = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            sum = (sum * 10) + digit;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
