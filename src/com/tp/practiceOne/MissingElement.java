package com.tp.practiceOne;

import java.util.Arrays;

public class MissingElement {

    public static int missingNumber(int[] nums) {
        if (nums.length == 1 && nums[0] != 0) return 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) return nums[i] + 1;
        }
        return nums[nums.length - 1] + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(missingNumber(arr));
    }
}
