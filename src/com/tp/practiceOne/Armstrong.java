package com.tp.practiceOne;

public class Armstrong {

    public static int isArm(int num, int sum, int size) {
        if (num <= 0) return sum;
        sum += (int) Math.pow(num % 10, size);
        return isArm(num / 10, sum, size);
    }

    public static void main(String[] args) {
        int n = 153;
//        String string = n.toString();
//        System.out.println(string.length());
//        int sum = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            sum += Math.pow(rem, string.length());
//            n /= 10;
//        }
//        System.out.println(sum);

        System.out.println(isArm(n, 0, String.valueOf(n).length()));
    }
}
