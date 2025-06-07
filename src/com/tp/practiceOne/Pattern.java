package com.tp.practiceOne;

public class Pattern {

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        int st = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < st; j++) {
                System.out.print("*");
            }
            System.out.println();
            st++;
        }
    }

    public static void pattern3(int n) {
        int st = 1, spc = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            st++;
            spc--;
        }
    }

    public static void pattern4(int n) {
        int st = n, spc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*");
            }
            System.out.println();
            st--;
            spc++;
        }
    }

    public static void pattern5(int n) {
        int st = 1, spc = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*");
            }
            System.out.println();
            st += 2;
            spc--;
        }
    }

    public static void pattern6(int n) {

        Character c = 'A';
        int st = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < st; j++) {
                System.out.print(c++);
            }
            System.out.println();
            st++;
        }
    }

    public static void pattern7(int n) {
        int st=1;
        for(int i=0;i<n;i++){
            Character c='A';
            for(int j=0;j<st;j++){
                System.out.print(c++);
            }
            System.out.println();
            st++;
        }
    }

    public static void main(String[] args) {
        int n = 5;

        int st=1,spc=n-1;
        Character c='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<spc;j++){
                System.out.print(" ");
            }
            for (int j=0;j<st;j++){
                if(j<=n/2) System.out.print(c++);
                else System.out.print(--c);
            }
            System.out.println();
            st+=2;
            spc--;
        }
    }
}
