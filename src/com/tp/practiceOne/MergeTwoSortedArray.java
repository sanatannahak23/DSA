package com.tp.practiceOne;

//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//        Example 2:
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//Example 3:
//
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 1 && nums1[0] != 0) {
            System.out.println(Arrays.toString(nums1));
            return;
        } else if (nums2.length == 1 && nums2[0] != 0) {
            System.out.println(Arrays.toString(nums2));
            return;
        }
        if (nums1.length > nums2.length) {
            System.arraycopy(nums2, 0, nums1, m, nums2.length);
        } else System.arraycopy(nums1, 0, nums2, n, nums1.length);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }
}
