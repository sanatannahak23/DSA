package com.tp.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IdentifyWordsWithSpecial {
    public static boolean check(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) return false;
        }
        return true;
    }

    public static List<String> find(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (check(next)) iterator.remove();
        }

        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("s*ure");
        list.add("k))run");

        System.out.println(find(list));
    }
}
