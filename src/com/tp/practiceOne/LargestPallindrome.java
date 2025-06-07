package com.tp.practiceOne;

public class LargestPallindrome {

    public static boolean isPallindrome(String str) {
        int i, j;

        for (i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "rppp";
        int len = 0;
        String max = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String temp = "";
                if (isPallindrome(str.substring(i, j + 1))) temp = str.substring(i, j + 1);
                if (temp.length() > len) {
                    len = temp.length();
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }
}
