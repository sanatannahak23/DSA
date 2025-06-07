package com.tp.stream;

import java.util.Comparator;
import java.util.List;

public class SortEmployee {

    public static void main(String[] args) {
        List<Employee> employee = Utility.getEmployee();
        System.out.println("Before sorting.....");
        System.out.println(employee);
        System.out.println("\nAfter sorting...");
        employee
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}
