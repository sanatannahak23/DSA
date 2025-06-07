package com.tp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoList {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        Stream
                .concat(list1.stream(), list2.stream())
                .sorted()
                .toList();

        Integer[] arr1 = {1, 3, 5, 7, 9};
        Integer[] arr2 = {2, 4, 6, 8, 10};
        Stream
                .concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();

    }
}
