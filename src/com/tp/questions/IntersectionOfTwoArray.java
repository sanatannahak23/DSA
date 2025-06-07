package com.tp.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = Arrays.stream(nums1)
                .boxed()
                .toList();
        return Arrays
                .stream(nums2)
                .boxed()
                .filter(list::contains)
                .collect(Collectors.toSet())
                .stream()
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

}
