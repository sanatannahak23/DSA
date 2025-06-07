package com.tp.practiceOne;

import java.util.*;

public class FindMostCommonWord {

    public static List<String> collectWords(String paragraph) {
        String[] words = paragraph.split("[ ,]+");
        ArrayList<String> data = new ArrayList<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            StringBuilder s = new StringBuilder();
            for (char c : charArray) {
                if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') s.append(c);
            }
            data.add(s.toString().toLowerCase());
        }
        return data;
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        List<String> strings = collectWords(paragraph);
        Map<String, Integer> countData = new LinkedHashMap<>();
        for (String s : strings) {
            boolean check = false;
            for (int i = 0; i < banned.length; i++) {
                if (s.equalsIgnoreCase(banned[i])) {
                    check = true;
                    break;
                }
            }
            if (!check) countData.put(s, countData.getOrDefault(s, 0) + 1);
        }
        Set<Map.Entry<String, Integer>> entries = countData.entrySet();

        return entries.stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public static void main(String[] args) {
//        String[] arr = {"hit"};
        String[] arr = {};
//        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", arr));
//        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit. Bob hit a ball, the hit BALL flew far after it was hit.", arr));
        System.out.println(mostCommonWord("a.", arr));

    }
}
