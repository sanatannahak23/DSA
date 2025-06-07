package com.tp.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmp {

    static class Employee {
        private String empName;
        private double salary;

        // Constructor
        public Employee(String empName, double salary) {
            this.empName = empName;
            this.salary = salary;
        }

        // Getters
        public String getEmpName() {
            return empName;
        }

        public double getSalary() {
            return salary;
        }

        // toString for display
        @Override
        public String toString() {
            return "Employee{name='" + empName + "', salary=" + salary + "}";
        }
    }

    public static void main(String[] args) {
        Map<Employee, String> employeeMap = new HashMap<>();
        employeeMap.put(new Employee("John", 50000), "HR");
        employeeMap.put(new Employee("Alice", 60000), "Finance");
        employeeMap.put(new Employee("Bob", 45000), "IT");
        employeeMap.put(new Employee("Diana", 70000), "Admin");

        LinkedHashMap<Employee, String> collect = employeeMap
                .entrySet()
                .stream()
                .sorted(Comparator.comparingDouble(entry -> entry.getKey().getSalary()))
                .collect(Collectors.toMap(



                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (s, s2) -> s,
                        LinkedHashMap::new)
                );

        System.out.println(collect);
    }
}
