package com.tp.questions;

//Example 1:
//
//Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
//Output: 1
//Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
//        Example 2:
//
//Input: intervals = [[1,2],[1,2],[1,2]]
//Output: 2
//Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
//        Example 3:
//
//Input: intervals = [[1,2],[2,3]]
//Output: 0
//Explanation: You don't need to remove any of the intervals since they're already non-overlapping.

import java.util.HashMap;

public class FindOverlapping {

    public static int eraseOverlapIntervals(int[][] intervals) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int[] arr : intervals) {
            int res = arr[1] - arr[0];
            map.put(res, map.getOrDefault(res, 0) + 1);
            if (map.get(res) > max) max = map.get(res);
        }
        return max - 1;
    }

    public static void main(String[] args) {
//        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
//        int[][] arr = {{1, 2}, {1, 2}, {1, 2}};
        int[][] arr = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        System.out.println(eraseOverlapIntervals(arr));
    }
}
