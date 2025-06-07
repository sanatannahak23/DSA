package com.tp.practiceOne;

public class Flower {

    public static int maxFlowerRow(int[][] arr) {
        int max = 0, index = 0, i = 0;
        for (int[] a : arr) {
            i++;
            int sum = 0;
            for (int n : a) sum += n;
            if (sum > max) {
                max = sum;
                index = i - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1,}, {0, 1, 1}, {1, 0, 1}
        };
        System.out.println(maxFlowerRow(arr));
    }
}
