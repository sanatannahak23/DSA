package com.tp.practiceOne;

//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]


import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstAndLastIndex {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        ArrayList<Integer> indexs = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) indexs.add(i);
        }
        if (!indexs.isEmpty()) {
            result[0] = indexs.getFirst();
            result[1] = indexs.getLast();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(arr, 6)));
    }
}
