package com.tp.questions;

import java.util.Arrays;

public class SortMiddleElement {

    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 4, 5, 15};
        int[] updated = Arrays.copyOfRange(arr, 1, arr.length - 1);
        Arrays.sort(updated);

        int i = 1, j = 0;
        while (i < arr.length - 1) {
            arr[i++] = updated[j++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
