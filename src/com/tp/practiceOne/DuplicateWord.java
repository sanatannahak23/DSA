package com.tp.practiceOne;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void findDuplicate(String text) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(text.split(" "))
                .forEach(string -> map.put(string, map.getOrDefault(string, 0) + 1));
        System.out.println(map);
    }

    public static void main(String[] args) {
        String text = "This is a test. This test is simple. This is just a test.";
        findDuplicate(text);
//        String[] s = text.toLowerCase().split(" ");
//
//        Map<String,Integer> word=new HashMap<>();
//        for(String a:s){
//            if(!a.isEmpty()){
//                word.put(a,word.getOrDefault(a,0)+1);
//            }
//        }
//
//        int max=0;
//        String w="";
//        for(Map.Entry<String,Integer> m:word.entrySet()){
//            if(m.getValue()>max){
//                max=m.getValue();
//                w=m.getKey();
//            }
//        }
//        System.out.println(w+" : "+max);

//        String word = "Hel? lo";
//
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == ' ') System.out.println("executed..");
//        }
    }
}
