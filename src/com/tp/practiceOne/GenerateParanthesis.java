package com.tp.practiceOne;

//Example 1:
//
//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]
//Example 2:
//
//Input: n = 1
//Output: ["()"]


import java.util.List;

public class GenerateParanthesis {

    public static List<String> generateParenthesis(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n * 2; i++) {
            if (i >= n) {
                stringBuilder.append(')');
                continue;
            }
            stringBuilder.append('(');
        }
        return List.of(stringBuilder.toString());
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
    }
}
