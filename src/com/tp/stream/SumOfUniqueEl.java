package com.tp.stream;

import java.util.Arrays;

public class SumOfUniqueEl {
    
    public static int sum(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .distinct()
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,6,7,8,1,1,8,8,7}));
    }
}
