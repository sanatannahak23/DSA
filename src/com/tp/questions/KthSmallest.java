package com.tp.questions;

import java.util.PriorityQueue;

public class KthSmallest {

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        for (int[] arr : matrix) {
            for (int n : arr) {
                queue.add(n);
                if (queue.size() > k) queue.poll();
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;
        System.out.println(kthSmallest(arr, k));
    }
}
