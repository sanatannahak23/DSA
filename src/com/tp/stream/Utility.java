package com.tp.stream;

import java.util.List;

public class Utility {

    public static List<Employee> getEmployee() {
        return List.of(
                new Employee(101, "Suresh", 22, 55000),
                new Employee(102, "Rohit", 23, 30000),
                new Employee(103, "Krunal", 22, 29000),
                new Employee(105, "Pratik", 25, 33000),
                new Employee(104, "Nihar", 29, 45000)
        );
    }
}
