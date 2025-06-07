package com.tp.practiceOne;

import java.util.Arrays;

//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
public class FindTarget {

    public static int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] + 1 == target) return i + 1;
            if (nums[i] - 1 == target) return i;
        }
        return target > nums[nums.length - 1] ? nums.length : 0;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1001}, 11));
    }
}
