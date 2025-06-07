package com.tp.practiceOne;

import java.util.Arrays;

public class BinarySearach {

    public static int search(int[] arr, int n) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int mid = (i + j) / 2;
            if (arr[mid] == n) return mid;
            if (n < arr[mid]) j = mid - 1;
            if (n > arr[mid]) i = mid + 1;
        }
        return -1;
    }

    public static int searchTwo(int[] arr, int target) {
        int st = 0, end = arr.length - 1, res = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] >= target) {
                res = mid;
                end = mid - 1;
            } else st = mid + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 0));
    }
}
