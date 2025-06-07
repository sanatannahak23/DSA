package com.tp.practiceOne;

//Example 1:
//
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]   // rest thing can be anything.
//Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//It does not matter what you leave beyond the returned k (hence they are underscores).
//Example 2:
//
//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//Note that the five elements can be returned in any order.
//It does not matter what you leave beyond the returned k (hence they are underscores).

import java.util.Arrays;

public class RemoveRepeateElments {

    public static int removeElement(int[] nums, int val) {
        int w = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[w++] = nums[i];
            }
        }
        return w;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int i = removeElement(nums, 3);
        System.out.println(i + " and " + Arrays.toString(Arrays.copyOf(nums, i)));
    }
}
