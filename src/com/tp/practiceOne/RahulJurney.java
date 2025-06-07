package com.tp.practiceOne;

public class RahulJurney {

    public static int days(int N) {
        int count = 0;

        while (N > 0) {
            if (N % 2 == 0) { // Even
                N /= 2;
            } else { // Odd
                N -= 1;
            }
            count++; // Count this place
        }

        return count-1;
    }

    public static void main(String[] args) {
        System.out.println(days(10));
    }
}
