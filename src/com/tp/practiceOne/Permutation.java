package com.tp.practiceOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Example 1:
//
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//Example 2:
//
//Input: nums = [0,1]
//Output: [[0,1],[1,0]]
//Example 3:
//
//Input: nums = [1]
//Output: [[1]]
public class Permutation {

    public static int[] swap(int[] nums, int st, int end) {
        int temp = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
        return nums;
    }

    public static void permutation(int[] nums, int st, int end) {

        if (st == end) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        for (int i = st; i <= end; i++) {
            int[] nums1 = swap(nums, st, i);
            permutation(nums1, st + 1, end);
        }

    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        permutation(nums, 0, nums.length - 1);
        return List.of();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permuteUnique(arr);
    }
}
