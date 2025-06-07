package com.tp.practiceOne;

public class FrequencyOfElement {

    private static void countOne(Integer[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // Skip already visited elements
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                    visited[j] = true; // Mark as visited
                }
            }
            System.out.println(arr[i] + " : " + count);
        }
    }


    public static void main(String[] args) {
        Integer[] arr = {5, 8, 3, 5, 4};
        countOne(arr);


    }
}
