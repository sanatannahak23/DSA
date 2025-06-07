package com.tp.questions;

import java.util.Arrays;

public class CharlesXavier {

    public static int[] findWinner(int len, int[][] arr) {
        int max = 0;
        int[] res = new int[0];

        for (int[] m : arr) {
            int count = 0;
            for (int i = 0; i < m.length; i++) {
                if (m[i] == 1) count++;
            }
            if (count > max) res = m;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 0}, {1, 0, 2}, {1, 1, 0}};
        System.out.println(Arrays.toString(findWinner(3, arr)));
    }
}
