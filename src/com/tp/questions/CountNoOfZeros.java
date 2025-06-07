package com.tp.questions;

public class CountNoOfZeros {

    public static int countZeroesAndOnes(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '1' || c == '0') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "00013434488111111000000";
        System.out.println(countZeroesAndOnes(str));
    }
}
