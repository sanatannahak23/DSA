package com.tp.questions;

//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true

public class SearchIn2DMat {

    public static boolean search(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == target) return true;
            else if (target > arr[mid]) st = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        for (int[] arr : matrix) {
            res = search(arr, target);
            if (res) return res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
//        System.out.println(searchMatrix(arr, target));
        int[] a = {1, 0, 1, 1, 1};
        System.out.println(search(a, 0));
    }
}
