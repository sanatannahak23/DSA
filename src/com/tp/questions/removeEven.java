package com.tp.questions;

import java.util.ArrayList;
import java.util.List;

public class removeEven {

    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 8, 9};
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) l.add(arr[i]);
        }
        System.out.println(l);

    }
}
