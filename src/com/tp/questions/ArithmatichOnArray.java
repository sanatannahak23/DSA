package com.tp.questions;

//Example 1:
//Input: tokens = ["2","1","+","3","*"]
//Output: 9
//Explanation: ((2 + 1) * 3) = 9
//Example 2:
//Input: tokens = ["4","13","5","/","+"]
//Output: 6
//Explanation: (4 + (13 / 5)) = 6
//Example 3:
//Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//Output: 22

import java.util.Stack;

public class ArithmatichOnArray {

    public static boolean isOperator(String str) {
        if (str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*")) return true;
        return false;
    }

    public static int task(String c, int a, int b) {
        switch (c) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
        }
        return 0;
    }

    public static Integer operations(String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (String str : arr) {
            if (isOperator(str)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(task(str, a, b));
            } else stack.push(Integer.parseInt(str));
        }
        System.out.println(stack);
        return stack.get(0);
    }

    public static void main(String[] args) {
        String[] arr = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        operations(arr);
    }
}
