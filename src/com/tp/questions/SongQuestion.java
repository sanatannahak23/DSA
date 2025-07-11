package com.tp.questions;

import java.util.ArrayList;
import java.util.Collections;

public class SongQuestion {

    public static void play(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : arr) {
            list.add(n);
        }
        Collections.shuffle(list);

        for (int n : list) {
            System.out.println("Listen song : " + n);
        }
        System.out.println("Song listened...");
        System.out.println(list);
    }

    public static void main(String[] args) {
        play(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
}
