package com.tp.questions;

import java.util.PriorityQueue;

public class KthLargest {

    public static int findKthLargest(int[] nums, int k) {
//        Integer[] array = Arrays.stream(nums)
//                .boxed()
//                .sorted(Collections.reverseOrder())
//                .toArray(Integer[]::new);
//        System.out.println(Arrays.toString(nums));
//        return array[k - 1];

        PriorityQueue<Integer> queu = new PriorityQueue<>();
        for (int n : nums) {
            queu.add(n);
            if (queu.size() > k) queu.poll();
        }
        return queu.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
//        Arrays.sort(nums);
        System.out.println(findKthLargest(nums, k));
    }
}
