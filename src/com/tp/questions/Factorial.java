package com.tp.questions;

public class Factorial {

    public static Integer fact(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }
}
