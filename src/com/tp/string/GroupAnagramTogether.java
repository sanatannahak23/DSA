package com.tp.string;

import java.util.*;

public class GroupAnagramTogether {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        while (!s1.isEmpty()) {
            char c = s1.charAt(0);
            s1 = s1.replace(c + "", "");
            s2 = s2.replace(c + "", "");
            if (s1.length() != s2.length()) return false;
        }
        return true;
    }

    public static List<List<String>> group(String[] arr) {
        ArrayList<List<String>> lists = new ArrayList<>();
        boolean[] checks = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (checks[i]) continue;
            ArrayList<String> list = new ArrayList<>();
            list.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (isAnagram(arr[i], arr[j])) {
                    list.add(arr[j]);
                    checks[j] = true;
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public static List<List<String>> findAnagrams(String[] arr) {
        Map<String, List<String>> map = new LinkedHashMap<>();
        for (String word : arr) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            map.computeIfAbsent(new String(chars), s -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(findAnagrams(arr));
    }
}
