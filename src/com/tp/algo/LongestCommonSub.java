package com.tp.algo;

public class LongestCommonSub {

    public static String find(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] arr = new int[m + 1][n + 1];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                } else arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
            }
        }

        StringBuilder stb = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                stb.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (arr[i - 1][j] > arr[i][j - 1]) {
                i--;
            } else j--;
        }
        return stb.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(find(s1, s2));
    }
}
