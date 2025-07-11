package com.tp.stream;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class CheckPrime {

    public static boolean isPrime(int n) {
        if (n <= 0) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);

        boolean isPrime = numbers
                .stream()
                .anyMatch(CheckPrime::isPrime);
//        System.out.println(isPrime);

        Class<Employee> clazz = Employee.class;
        Field[] fields = clazz.getDeclaredFields();

        for (Field field:fields){
            System.out.println("Filed name :: "+field.getName());
            System.out.println("Field type :: "+field.getType());
        }
    }
}
