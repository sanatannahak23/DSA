package com.tp.questions;


import java.util.ArrayList;
import java.util.List;


//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]

public class SpiralPattern {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>(m * n);
        int r = 0, c = -1;
        char ch = 'r';
        for (int i = 0; i < m * n; i++) {
            switch (ch) {
                case 'r' -> {
                    c++;
                    list.add(matrix[r][c]);
                    if (r + c == n - 1)
                        ch = 'd';
                }
                case 'd' -> {
                    r++;
                    list.add(matrix[r][c]);
                    if (r == c) ch = 'l';
                }
                case 'l' -> {
                    c--;
                    list.add(matrix[r][c]);
                    if (r + c == n - 1) ch = 't';
                }
                case 't' -> {
                    r--;
                    list.add(matrix[r][c]);
                    if (r - 1 == c) ch = 'r';
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(arr));
    }
}
