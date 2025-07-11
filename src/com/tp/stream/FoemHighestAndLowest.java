package com.tp.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FoemHighestAndLowest {

    public static String higherSlashLowest(int[] arr) {
        String lowest = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.naturalOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());

        String highest = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());

        return highest + " / " + lowest;
    }

    public static void main(String[] args) {
        System.out.println(higherSlashLowest(new int[]{1,2,3,4,5}));
    }
}
