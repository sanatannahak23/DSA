package com.tp.practiceOne;

import java.util.Arrays;

//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//        Example 1:
//
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//Example 2:
//
//Input: nums = [0]
//Output: [0]
public class MoveEvenToRigh {

    public static int[] moveToLeft(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int n = arr[i];
                for (int j = i; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = n;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(Arrays.toString(moveToLeft(arr)));
    }
}
