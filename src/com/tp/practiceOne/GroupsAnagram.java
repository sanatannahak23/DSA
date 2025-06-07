package com.tp.practiceOne;

//nput: strs = ["eat","tea","tan","ate","nat","bat"]
//
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//
//Explanation:
//
//There is no string in strs that can be rearranged to form "bat".
//The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

import java.util.ArrayList;
import java.util.List;

public class GroupsAnagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        while (!s1.isEmpty()) {
            String c = s1.charAt(0) + "";
            s1 = s1.replace(c, "");
            s2 = s2.replace(c, "");
            if (s1.length() != s2.length()) return false;
        }
        return true;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        boolean[] check = new boolean[strs.length];
        List<List<String>> anagrams = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (check[i]) continue;
            ArrayList<String> res = new ArrayList<>();
            res.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                if (isAnagram(strs[i], strs[j])) {
                    res.add(strs[j]);
                    check[j] = true;
                }
            }
            anagrams.add(res);
        }
        return anagrams;
    }

    public static void main(String[] args) {
//        System.out.println(isAnagram("tan", "na5t"));
        System.out.println(groupAnagrams(new String[]{"a"}));
    }
}
