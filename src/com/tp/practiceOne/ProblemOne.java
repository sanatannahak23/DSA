package com.tp.practiceOne;


//input : java600
//ouput : java    600
//ctt56   ctt   056
public class ProblemOne {

    public static void main(String[] args) {
        String s = "java600";
        char[] charArray = s.toCharArray();

        String num = "";
        String temp = "";
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) num += charArray[i];
            else temp += charArray[i];
        }
        if (Integer.parseInt(num) < 100) num = '0' + num;
        System.out.println(temp + "\t" + num);
    }
}
