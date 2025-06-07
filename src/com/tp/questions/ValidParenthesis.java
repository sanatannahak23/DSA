package com.tp.questions;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{(()}}[]"));
    }
}
