package com.tp.enums;

import java.util.Arrays;

public class Test {

    public static String simplifyPath(String path) {
        String[] word = path.split("/+");

        System.out.println(Arrays.toString(word));
        StringBuilder sb = new StringBuilder();
        for (String w : word) {
            if (!w.isEmpty() && !(w.charAt(0) == '.')) {
                sb.append("/").append(w);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        Day sunday = Day.valueOf("SUNDAY");
//        System.out.println(sunday);
//        System.out.println(sunday.getHindi());

//        System.out.println(Day.getHindi("Sunday"));

        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
    }
}
