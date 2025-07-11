package com.tp.stream;

import java.lang.reflect.Field;
import java.util.List;

public class SortEmployee {

    public static void main(String[] args) {
        List<Employee> employee = Utility.getEmployee();

        Class<Employee> clazz = Employee.class;
        Field[] fields = clazz.getFields();


//        System.out.println("Before sorting.....");
//        System.out.println(employee);
//        System.out.println("\nAfter sorting...");
//        employee
//                .stream()
//                .sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getSalary))
//                .forEach(System.out::println);

        }
    }
