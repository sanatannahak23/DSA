package com.tp.practiceOne;

public class ReverseString {

    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];        // reversion array via swaping
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Rahul is a very good boy."));
    }
}
