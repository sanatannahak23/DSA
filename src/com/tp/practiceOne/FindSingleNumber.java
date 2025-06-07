package com.tp.practiceOne;

//Example 1:
//
//Input: nums = [2,2,1]
//
//Output: 1
//
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//
//Output: 4
//
//Example 3:
//
//Input: nums = [1]
//
//Output: 1


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSingleNumber {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> list = map.keySet().stream().filter(n -> map.get(n) == 1).toList();
        return list.getFirst();
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 6};
        System.out.println(singleNumber(arr));
    }
}
