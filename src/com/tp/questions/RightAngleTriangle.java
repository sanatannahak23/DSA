package com.tp.questions;

public class RightAngleTriangle {

    public static void main(String[] args) {
        int n=5;
        char c='A';

        int st=1,spc=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<spc;j++){
                System.out.print(" ");
            }
            for (int j=0;j<st;j++){
                System.out.print(c++);
            }
            System.out.println();
            st++;spc--;
        }
    }
}
