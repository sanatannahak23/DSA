package com.tp.stream;

import java.util.Arrays;
import java.util.List;

public class FindAvgAge {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        double v = persons
                .stream()
                .mapToInt(Person::getAge)
                .average()
                .orElseGet(() -> 0.0);
        System.out.println(v);
    }
}
