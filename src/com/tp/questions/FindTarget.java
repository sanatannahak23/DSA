package com.tp.questions;

public class FindTarget {

    public static int target(int[] arr, int n) {
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == n) return mid;
            if (arr[mid] < n) i = mid + 1;
            else j = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 7, 9, 12, 15, 17, 21, 24};
        System.out.println(target(arr, 17));
    }
}
