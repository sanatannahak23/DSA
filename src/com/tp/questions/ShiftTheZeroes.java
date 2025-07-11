package com.tp.questions;

import java.util.Arrays;

public class ShiftTheZeroes {

    public static void shiftZeroes(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            while (i < j && arr[i] != 0) i++;
            while (i < j && arr[j] == 0) j--;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 4, 5, 0, 9, 10, 0, 9, 6, 3};
//        int[] arr = {0, 0,0, 0, 0,0, 0, 0,0, 0};
        shiftZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
