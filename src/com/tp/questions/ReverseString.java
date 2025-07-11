package com.tp.questions;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static String reverse(String str) {
        return IntStream.range(0,str.length())
                .mapToObj(i -> str.charAt(str.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static String reverseStr(String str){
        char[] chars = str.toCharArray();
        int i=0,j=chars.length-1;
        while (i<=j){
            char c=chars[i];
            chars[i]=chars[j];
            chars[j]=c;
            i++;j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        CompletableFuture<Integer> c1 = CompletableFuture.supplyAsync(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
            }
            return 20;
        });

        CompletableFuture<Character> c2 = CompletableFuture.supplyAsync(() -> {
            for (char c = 'A'; c <= 'z'; c++) {
                System.out.println(c);
            }
            return 'Z';
        });

        CompletableFuture<Void> al = CompletableFuture.allOf(c1, c2);
        al.join();
//        System.out.println(reverse("sanatanNahak"));
    }
}
