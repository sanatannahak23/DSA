package com.tp.practiceOne;

//1.	Find pair Solve: ==
//input: a[2,3,7,6,9,3,1]
//sum = 9;
//output: 2,7
//        6,3


import com.sun.source.doctree.SeeTree;

import java.util.*;

public class FindPariSize {

    public static void findPair(int[] arr, int sum) {
        HashSet<Set<Integer>> restult = new HashSet<>();
//        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            Set<Integer> sort = new TreeSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    sort.add(arr[i]);
                    sort.add(arr[j]);
                }
            }
            if (sort.size() != 0) restult.add(sort);
        }
//        if (set.size() == 1) {
//            Integer i = set.stream().findFirst().get();
//            System.out.println(List.of(i, i));
//            return;
//        }
        System.out.println(restult);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 6, 9, 3, 1, 6, 3, 6, 3};
        int sum = 9;
        findPair(arr, sum);
//        System.out.println(findPair(arr, sum));
    }
}
