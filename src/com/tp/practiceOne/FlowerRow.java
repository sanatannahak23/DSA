package com.tp.practiceOne;

public class FlowerRow {

    public static int highestRow(int[][] arr) {
        int count = 0, max = 0, index = 0;

        for (int[] m : arr) {
            int sum = 0;
            count++;
            for (int n : m) {
                sum += n;
            }
            if (sum > max) {
                max = sum;
                index = count;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 10}, {2, 0, 6}, {3, 8, 9}};
        System.out.println(highestRow(arr));
    }
}
