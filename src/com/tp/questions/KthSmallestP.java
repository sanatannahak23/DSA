package com.tp.questions;

//Example 1:
//
//Input: arr = [1,2,3,5], k = 3
//Output: [2,5]
//Explanation: The fractions to be considered in sorted order are:
//        1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
//The third fraction is 2/5.
//Example 2:
//
//Input: arr = [1,7], k = 1
//Output: [1,7]

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class KthSmallestP {

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        TreeMap<Double, int[]> map = new TreeMap<>();
        PriorityQueue<Double> queue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double res = arr[i] / (arr[j] + .0);
                int[] a = {arr[i], arr[j]};
                queue.add(res);
                map.put(res, a);
//                if (queue.size() > k) queue.poll();
            }
        }
        System.out.println(queue);
        return map.get(queue.peek());
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, k)));
    }
}
