package com.tp.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAvgAge {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

//        double v = persons
//                .stream()
//                .mapToInt(Person::getAge)
//                .average()
//                .orElseGet(() -> 0.0);
//        System.out.println(v);
//
//        persons
//                .stream()
//                .filter(person -> person.getAge() >= 30)
//                .forEach(System.out::println);

//        persons
//                .stream()
//                .collect(Collectors.toMap(
//                        Person::getAge,       // Key
//                        person -> person,     // Value
//                        (t, _) -> t,          // Handle duplicate key
//                        LinkedHashMap::new))
//                .forEach((integer, person) -> System.out.println(integer + " :: " + person));

        persons
                .stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .forEach((person, aLong) -> System.out.println(person + " :: " + aLong));

    }
}
