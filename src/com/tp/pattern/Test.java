package com.tp.pattern;

public class Test {

    public static void main(String[] args) {
        Student student = Student
                .builder()
                .setName("Sanatan Nahak")
                .setGender("Male")
                .setRoll(25)
                .build();

        System.out.println(student);
        System.out.println(SingleTon.getSingleTon()==SingleTon.getSingleTon());
    }
}
