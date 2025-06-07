package com.tp.practiceOne;

import java.util.Arrays;

public class TestComparator {

    public static void main(String[] args) {
        Student suresh = new Student("suresh", 25);
        Student krunal = new Student("krunal", 20);
        Student[] arr = {suresh, krunal};

        //System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (s1, s2) -> s2.getAge() - s1.getAge());
        System.out.println(Arrays.toString(arr));
    }
}
