package com.tp.practiceOne;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }

    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));

    }
}
