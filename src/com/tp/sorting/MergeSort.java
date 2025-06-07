package com.tp.sorting;

import java.util.Arrays;

public class MergeSort {

    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public void sort(int[] arr) {
        if (arr.length == 1) return;
        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length - arr1.length];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        System.arraycopy(arr, arr1.length, arr2, 0, arr2.length);
        sort(arr1);
        sort(arr2);
        merge(arr, arr1, arr2);
    }

    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        int[] arr = {6, 2, 9, 3, 7};
        merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
