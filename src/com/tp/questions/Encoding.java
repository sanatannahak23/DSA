package com.tp.questions;

public class Encoding {

    public static void main(String[] args) {
        String str = "sanatan nahak";
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] alpha = letters.toCharArray();
        char[] strArray = str.toCharArray();
        StringBuilder res = new StringBuilder();

        for (char c : strArray) {
            int index = c - 97;
            index = Math.abs((index + 3) % alpha.length);
            res.append(alpha[index]);
        }
        System.out.println(res);
        
    }
}
