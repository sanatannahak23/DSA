package com.tp.practiceOne;

//Example 1:
//
//Input: num1 = "2", num2 = "3"
//Output: "6"
//Example 2:
//
//Input: num1 = "123", num2 = "456"
//Output: "56088"

public class MultiplyString {

    public static String multiply(String num1, String num2) {
        return String.valueOf(Long.parseLong(num1) * Long.parseLong(num2));
    }

    public static void main(String[] args) {
        System.out.println(multiply("498828660196", "840477629533"));
        System.out.println(Math.pow(2.00,-2));
    }
}
