package com.tp.practiceOne;

public class MedianOfTwoSortedArr {

    public static double merge(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) merged[k++] = nums1[i++];
            else merged[k++] = nums2[j++];
        }
        while (i < nums1.length) merged[k++] = nums1[i++];
        while (j < nums2.length) merged[k++] = nums2[j++];
        if (merged.length % 2 == 0) return (merged[merged.length / 2] + merged[(merged.length / 2) - 1])/2.0;
        else return merged[merged.length / 2];
    }

    public static void main(String[] args) {
//        Example 1:
//
//        Input: nums1 = [1,3], nums2 = [2]
//        Output: 2.00000
//        Explanation: merged array = [1,2,3] and median is 2.
//        Example 2:
//
//        Input: nums1 = [1,2], nums2 = [3,4]
//        Output: 2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
        System.out.println(merge(new int[]{1, 3}, new int[]{2, 4}));

    }
}
