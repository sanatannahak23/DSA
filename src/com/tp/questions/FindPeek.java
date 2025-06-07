package com.tp.questions;

public class FindPeek {

    public static int findPeakElement(int[] nums) {
//        int st = 0, end = nums.length - 1;
//        while (st <= end) {
//            int mid = st + (end - st) / 2;
//            if (nums[mid] > nums[mid + 1]) end = mid;
//            else st = mid + 1;
//        }
//        return st;

        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 1, 9, 58, 20, 36, 11, 11};
        System.out.println(findPeakElement(arr));
    }
}
