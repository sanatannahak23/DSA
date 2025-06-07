package com.tp.practiceOne;

import java.util.Arrays;

public class ContainDuplicate {

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int n : nums) {
//            set.add(n);
//        }
//        return !(nums.length == set.size());
        boolean cond = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cond = false;
                    break;
                }
            }
        }
        return cond;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        moveZeroes(arr);
//        System.out.println(containsDuplicate(arr));
    }

}
