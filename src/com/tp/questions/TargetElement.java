package com.tp.questions;

public class TargetElement {

    public static void target(int[] arr, int n) {

        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == n) {
                System.out.println(arr[i] + " and " + arr[j]);
                i++;
                j--;
                continue;
            }
            if (arr[i] + arr[j] < n) i++;
            else j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 8};
        target(arr, 11);
    }
}
