package com.tp.practiceOne;

public class TwoBoxes {

    public static void main(String[] args) {
        int box=8,merget=2,count=0;

        while (box!=1){
            merget+=2;
            count++;
            box--;
        }
        System.out.println(count);
    }
}
