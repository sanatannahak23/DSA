package com.tp.practiceOne;

//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].

import java.util.Arrays;

public class DigitPluOne {

    public static int[] plusOne(int[] digits) {
//        String replace = Arrays.toString(digits)
//                .replace(",", "")
//                .replace("[", "")
//                .replace("]", "")
//                .replace(" ", "");
//        long res = Long.parseLong(replace) + 1;
//        char[] charArray = Long.toString(res).toCharArray();
//        int[] ints = new int[charArray.length];
//        for (int i = 0; i < charArray.length; i++) {
//            ints[i] = charArray[i] - '0';
//        }
//        return ints;

//
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
