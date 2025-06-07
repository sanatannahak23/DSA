package com.tp.practiceOne;

//Example 1:
//
//Input: nums = [2,3,1,1,4]
//Output: 2
//Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
//        Example 2:
//
//Input: nums = [2,3,0,1,4]
//Output: 2

import java.util.Arrays;
import java.util.HashMap;

public class FindNearMinEl {

    public static int jump(int[] nums) {
        int min = Arrays.stream(nums).min().orElse(0);
        HashMap<Integer, Integer> res = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == min) res.put(nums[i], i);
        }
        return !res.isEmpty() ? res.get(min) == 0 ? res.get(min) + 1 : res.get(min) : 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(jump(arr));
    }
}
