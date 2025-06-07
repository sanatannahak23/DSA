package com.tp.practiceOne;

public class BalanceString {

    public static boolean isBalanced(String s) {
        if (s.length() % 2 != 0) return false;
        int i, j;
        for (i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                System.out.println(substring);
//                if (substring.length() % 2 == 0) {
//                    String subStr1 = substring.substring(0, (substring.length() / 2) + 1);
//                    String subStr2 = substring.substring((substring.length() / 2) - 1, substring.length());
//                    System.out.println(subStr1 + " and " + subStr2);
//                    if (isBalanced(subStr1) && isBalanced(subStr2)) count++;
//                }
            }
        }
//        String subStr1 = s.substring(0, (s.length() / 2));
//        String subStr2 = s.substring(s.length() / 2, s.length());
//        int count = 0;
//        if (isBalanced(subStr1) && isBalanced(subStr2)) count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
}
