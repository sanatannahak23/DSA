package com.tp.questions;

import java.util.Arrays;

public class SortArrays {

    public static void main(String[] args) {
        int[][] arr = {{1, 4, 5}, {1, 3, 4}, {2, 6}};

        for (int[] m : arr) {
            Arrays.sort(m);
        }
    }
}
