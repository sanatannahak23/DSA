package com.tp.enums;

public enum Day {

    SUNDAY("Sunday", "Rabiwar"),
    MONDAY("Monday", "Somwar"),
    TUESTDAY("Tuestday", "Mangalwar"),
    WEDNESDAY("Wednesday", "Budhwar"),
    THURSDAY("Thursday", "Guruwar"),
    FRIDAY("Friday", "Sukruwar"),
    SATRUDAY("Saturday", "Saniwar");


    private final String value;
    private final String hindi;

    Day(String value, String hindi) {
        this.value = value;
        this.hindi = hindi;
    }

    public static String getHindi(String day) {
        for (Day d : values()) {
            return day.equals(d.value) ? d.hindi : null;
        }
        throw new IllegalArgumentException("Invalid argument..");
    }
}
