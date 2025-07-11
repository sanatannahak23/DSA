package com.tp.questions;

public class RotateFunction {
    public static int max = Integer.MIN_VALUE;

    public static void reverse(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static int res(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] * i);
        }
        return sum;
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        int res = res(arr);
        max = max < res ? res : max;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,6};
        for (int i = 0; i < arr.length; i++)
            rotate(arr, i + 1);
        System.out.println(max);
    }
}
