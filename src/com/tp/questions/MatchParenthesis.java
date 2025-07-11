package com.tp.questions;

public class MatchParenthesis {

    public static boolean isBalanced(String str) {
        if (str.isEmpty()) return false;

        while (str.contains("{}") || str.contains("[]") || str.contains("()")) {
            str = str.replace("()", "");
            str = str.replace("[]", "");
            str = str.replace("{}", "");
        }
        return str.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{()}[]"));
    }
}
