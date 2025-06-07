package com.tp.practiceOne;

import java.util.Arrays;

public class FindMaxMagnets {

    public static int maximumMagnets(int input1, int input2, int[] input3) {
        // Edge case: If there are no magnets, return 0
        if (input1 == 0) {
            return 0;
        }

        // Sort the array to easily check the difference between adjacent magnets
        Arrays.sort(input3);

        // Initialize variables
        int maxGroupSize = 1;  // At least one magnet will be in the group
        int currentGroupSize = 1;  // Start with the first magnet in the current group

        // Iterate through the array to form groups
        for (int i = 1; i < input1; i++) {
            // If the difference between consecutive magnets is >= Y, continue the group
            if (input3[i] - input3[i - 1] >= input2) {
                currentGroupSize++;
            } else {
                // Otherwise, finalize the current group and reset
                maxGroupSize = Math.max(maxGroupSize, currentGroupSize);
                currentGroupSize = 1;  // Start a new group
            }
        }

        // After the loop, check the last group
        maxGroupSize = Math.max(maxGroupSize, currentGroupSize);

        return maxGroupSize;
    }

    public static int maximumMagnetsTwo(int input1, int input2, int[] input3) {
        // Sort magnet strengths
        Arrays.sort(input3);

        int maxGroupSize = 0;

        // Iterate over each magnet as a starting point
        for (int i = 0; i < input1; i++) {
            int count = 1; // Current group size
            int current = input3[i]; // Current magnet strength
            int idx = i;

            // Find the next valid magnet using binary search
            while (true) {
                int nextIdx = lowerBound(input3, idx + 1, input1 - 1, current + input2);
                if (nextIdx == -1) break; // No valid magnet found
                count++;
                current = input3[nextIdx];
                idx = nextIdx;
            }

            // Update the maximum group size
            maxGroupSize = Math.max(maxGroupSize, count);
        }

        return maxGroupSize;
    }

    // Custom binary search to find the lower bound (first index >= target)
    private static int lowerBound(int[] arr, int start, int end, int target) {
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                result = mid; // Update result and search left for smaller index
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result; // Return -1 if no valid index is found
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
