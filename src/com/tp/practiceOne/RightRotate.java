package com.tp.practiceOne;

import java.util.Arrays;

public class RightRotate {

    public static int[] rotate(int[] arr) {
        int n = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = n;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 2; i++) rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
