package com.tp.pattern;

public class SingleTon {

    public static SingleTon singleTon;

    private SingleTon() {
    }

    public static SingleTon getSingleTon() {
        if (singleTon == null) singleTon = new SingleTon();
        return singleTon;
    }
}
