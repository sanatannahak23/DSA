package com.tp.questions;

//Input 1 : [1,1,2,2,2,3,3,4,5,5,5,6]
//Output : [1,2,3,4,5,6,-1,-1,-1,-1,-1,-1]

import java.util.Arrays;

public class RemoveDuplicate {

    public static void removeDuplicate(int[] arr) {
        int temp = arr[0];
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (temp == arr[i]) {
                arr[i] = -1;
                continue;
            }
            temp = arr[i];
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6};
        removeDuplicate(arr);
    }
}
