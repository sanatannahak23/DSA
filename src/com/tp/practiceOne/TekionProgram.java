package com.tp.practiceOne;

import java.util.Arrays;

public class TekionProgram {

    private static int findMaxGroup(int[] arr, int length, int def) {
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < length; i++) {
            int idx = i;
            int current = arr[i];
            int count = 1;
            while (true) {
                int findIdx = binarySearch(arr, idx + 1, length - 1, current + def);
                if (findIdx == -1) break;
                count++;
                idx = findIdx;
                current = arr[findIdx];
            }
            max = Math.max(count, max);
        }
        return max;
    }


    private static int binarySearch(int[] arr, int st, int end, int target) {
        int res = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] >= target) {
                res = mid;
                end = mid - 1;
            } else st = mid + 1;
        }
        return res;
    }

//    private static int binarySearch(int[] arr, int st, int end, int target) {
//        int res = -1;
//        while (st <= end) {
//            int mid = st + (end - st) / 2;
//            if (arr[mid] == target) return mid;
//            if (arr[mid] > target) {
//                end = mid - 1;
//            } else st = mid + 1;
//        }
//        return res;
//    }

    public static int findMax(int[] arr, int len, int def) {
        int count = 1, last = arr[0];
        for (int i = 0; i < len; i++) {
            if (arr[i] - last >= def) {
                count++;
                last = arr[i];
            }
        }
        return count;
    }


    public static void main(String[] args) {
//        int[] arr = {2, 8, 16, 25, 28, 36, 40};
        int[] arr = {2, 8, 16, 20, 28, 36, 44};
        System.out.println(findMax(arr, arr.length, 8));
        System.out.println(findMaxGroup(arr, arr.length, 8));
    }

}
