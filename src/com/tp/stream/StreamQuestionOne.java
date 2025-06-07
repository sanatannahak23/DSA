package com.tp.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestionOne {

    public static void main(String[] args) {
        List<Integer> list = List.of(5, 6, 8, 9, 5);
        list.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

    }
}
