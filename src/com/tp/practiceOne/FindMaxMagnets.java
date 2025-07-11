package com.tp.practiceOne;

import java.util.Arrays;

public class FindMaxMagnets {

    public static int maximumMagnets(int input1, int input2, int[] input3) {
        if (input1 == 0) {
            return 0;
        }
        Arrays.sort(input3);
        int maxGroupSize = 1;
        int currentGroupSize = 1;

        for (int i = 1; i < input1; i++) {
            if (input3[i] - input3[i - 1] >= input2) {
                currentGroupSize++;
            } else {
                maxGroupSize = Math.max(maxGroupSize, currentGroupSize);
                currentGroupSize = 1;
            }
        }

        maxGroupSize = Math.max(maxGroupSize, currentGroupSize);

        return maxGroupSize;
    }

    public static int maximumMagnetsTwo(int input1, int input2, int[] input3) {
        // Sort magnet strengths
        Arrays.sort(input3);

        int maxGroupSize = 0;
        for (int i = 0; i < input1; i++) {
            int count = 1;
            int current = input3[i];
            int idx = i;

            while (true) {
                int nextIdx = lowerBound(input3, idx + 1, input1 - 1, current + input2);
                if (nextIdx == -1) break;
                count++;
                current = input3[nextIdx];
                idx = nextIdx;
            }
            maxGroupSize = Math.max(maxGroupSize, count);
        }

        return maxGroupSize;
    }

    private static int lowerBound(int[] arr, int start, int end, int target) {
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] arr = {2, 8, 16, 20, 28, 36, 44};
//        int[] arr = {2, 8, 16, 20, 28, 36, 44};
//        System.out.println(maximumMagnets(arr.length, 8, arr));
//        System.out.println(maximumMagnetsTwo(arr.length, 8, arr));

        int input1 = 7;
        int input2 = 8;
        int[] input3 = {2, 8, 16, 20, 28, 36, 44};
        System.out.println(maximumMagnetsTwo(input1, input2, input3));
    }
}
