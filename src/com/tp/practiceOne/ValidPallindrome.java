package com.tp.practiceOne;

public class ValidPallindrome {

    public static boolean collectValid(String s) {
        char[] charArray = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : charArray) {
            if (c >= 97 && c <= 122 || c >= 65 && c <= 90 || c >= 48 && c <= 57)
                stringBuffer.append(c);
            if (charArray.length == 2 && c >= 48 && c <= 57) return false;
        }
        String str = stringBuffer.toString().toLowerCase();
        char[] array = str.toCharArray();
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] != array[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(collectValid("1a2"));
    }
}
