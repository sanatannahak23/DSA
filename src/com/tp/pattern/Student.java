package com.tp.pattern;

public class Student {

    private String name;

    private String gender;

    private Integer roll;

    public static Student builder() {
        return new Student();
    }

    public Student build() {
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Integer getRoll() {
        return roll;
    }

    public Student setRoll(Integer roll) {
        this.roll = roll;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", roll=" + roll +
                '}';
    }
}
