package com.tp.practiceOne;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitString {
    public static String[] split(String str) {
        String updated = str.trim();
        ArrayList<String> strings = new ArrayList<>();
        StringBuilder stb = new StringBuilder();
        for (char c : updated.toCharArray()) {
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                stb.append(c);
            } else if (!stb.isEmpty()) {
                strings.add(stb.toString());
                stb.setLength(0);
            }
        }
        if (!stb.isEmpty()) strings.add(stb.toString());
        return strings.toArray(new String[0]);
    }


    public static void main(String[] args) {
//        String str = "Hello,everyone_nice to meet,i2am sanatan.nahak";
        String str = "Java123Python";
        System.out.println(Arrays.toString(split(str)));
    }
}
