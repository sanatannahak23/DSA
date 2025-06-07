package com.tp.practiceOne;

import java.util.HashMap;
import java.util.Map;

public class LeftRotate {

    public static void rotate(Integer[] arr) {
        Integer temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    public static void rotateRight(Integer[] arr) {
        Integer temp = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }


    public static void main(String[] args) {
//        Integer[] arr={5,8,3,6,7};
//        System.out.println(Arrays.toString(arr));
//        rotateRight(arr);
//        System.out.println(Arrays.toString(arr));

        // Static string
        String text = "This is a test. This test is simple. This is just a test.";

        // Convert the string to lowercase and split into words
        String[] words = text.toLowerCase().split("\\W+");

        // Count word frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Find the most repeated word
        String mostRepeated = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostRepeated = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Print the most repeated word
        System.out.println("The most repeated word is: " + mostRepeated);
    }

}
