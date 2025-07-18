package com.tp.questions;

//You are given a 0-indexed integer array nums. A pair of indices (i, j) is a bad pair if i < j and j - i != nums[j] - nums[i].
//
//Return the total number of bad pairs in nums.
//        Example 1:
//
//Input: nums = [4,1,3,3]
//Output: 5
//Explanation: The pair (0, 1) is a bad pair since 1 - 0 != 1 - 4.
//The pair (0, 2) is a bad pair since 2 - 0 != 3 - 4, 2 != -1.
//The pair (0, 3) is a bad pair since 3 - 0 != 3 - 4, 3 != -1.
//The pair (1, 2) is a bad pair since 2 - 1 != 3 - 1, 1 != 2.
//The pair (2, 3) is a bad pair since 3 - 2 != 3 - 3, 1 != 0.
//There are a total of 5 bad pairs, so we return 5.
//Example 2:
//
//Input: nums = [1,2,3,4,5]
//Output: 0
//Explanation: There are no bad pairs.


import java.util.HashMap;

public class TotalNumOfBadPairs {

    public static int badPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int totalPairs = n * (n - 1) / 2;
        int goodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            int dif = i - nums[i];
            if (map.containsKey(dif)) {
                goodPairs += map.get(dif);
            }
            map.put(dif, map.getOrDefault(dif, 0) + 1);
        }

        return totalPairs - goodPairs;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 3};
        System.out.println(badPairs(nums));
    }
}
