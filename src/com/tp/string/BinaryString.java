package com.tp.string;

public class BinaryString {

    public static int binary(int n) {
        int res = 0;
        int mul = 10;

        while (n != 0) {
            int rem = n % 2;
            res += mul * rem;
            mul *= 10;
            n /= 2;
        }
        return res;
    }

    public static String toBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return new String(sb.reverse());
    }

    public static void main(String[] args) {
        System.out.println(toBinary(20));
    }
}
