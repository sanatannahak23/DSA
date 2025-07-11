package com.tp.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurance {

    public static Map<String , Long> countOfOccuranceUsingStream(List<String> list){
        return list
                .stream()
                .collect(Collectors.groupingBy(o -> o,Collectors.counting()));
    }

    public static Map<String ,Integer> countOfOccurance(List<String> list){
        HashMap<String, Integer> count= new HashMap<>();

        for (String str:list){
            count.put(str,count.getOrDefault(str,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("abc", "ddf", "abc", "kjl", "kjl", "def", "ddf", "abc");
        System.out.println(countOfOccuranceUsingStream(stringList));
    }
}
