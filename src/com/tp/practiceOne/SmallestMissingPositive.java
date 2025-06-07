package com.tp.practiceOne;


import java.lang.reflect.Array;
import java.util.Arrays;

//Example 1:
//
//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.
//        Example 2:
//
//Input: nums = [3,4,-1,1]
//Output: 2
//Explanation: 1 is in the array but 2 is missing.
//Example 3:
//
//Input: nums = [7,8,9,11,12]
//Output: 1
//Explanation: The smallest positive integer 1 is missing.
public class SmallestMissingPositive {

    public static int findMissing(int[] arr) {
        boolean find = true;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) continue;
            if (arr[i] == 1) find = false;
            if (!find && arr[i + 1] != arr[i] + 1) return arr[i] + 1;
        }
        if (find) return 1;
        else return arr[arr.length - 1] + 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 12, 1, 2};
        System.out.println(findMissing(arr));
    }
}
