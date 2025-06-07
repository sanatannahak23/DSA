package com.tp.questions;

//Example 1:
//
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
//Example 2:
//
//Input: numbers = [2,3,4], target = 6
//Output: [1,3]
//Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
//Example 3:
//
//Input: numbers = [-1,0], target = -1
//Output: [1,2]
//Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].

public class TwoSum {

    // Tow pointers approach

    public static int[] twoSum(Integer[] numbers, int target) {

        int st = 0, end = numbers.length - 1;

        while (st <= end) {
            int sum = numbers[st] + numbers[end];
            if (target == sum) return new int[]{st + 1, end + 1};
            else if (target < sum) end--;
            else st++;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int n = 9;
//        System.out.println(Arrays.toString(twoSum(arr, n)));
    }
}
