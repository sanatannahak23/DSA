package com.tp.practiceOne;

import javax.swing.plaf.IconUIResource;

public class ConvertToBinary {

    public static int toBinary(int n) {
        String res = "";
        int sum = 0, mul = 10;
        while (n > 0) {
            sum += (n % 2) * mul;
            mul *= 10;
            n /= 2;
        }
//        while (n > 0) {
//            res = (n % 2) + res;
//            n /= 2;
//        }
//        return Integer.parseInt(res);
        return sum;
    }

    public static int findConsucativeOne(int binary) {
        char[] chars = Integer.toString(binary).toCharArray();
        int i = 0;
        int max = 1;
        while (i < chars.length) {
            int count = 1;
            if (chars[i] == '1') {
                int j = i + 1;
                while (j < chars.length && chars[j] == '1') {
                    count++;
                    j++;
                }
                if (count > max) max = count;
                i = j + 1;
                continue;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        int binary = toBinary(20);
        System.out.println(findConsucativeOne(110101));
    }
}
