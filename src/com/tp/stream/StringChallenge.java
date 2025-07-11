package com.tp.stream;

public class StringChallenge {

    public static String StringChallenge(String str) {
        if (str.length() < 3) {
            return "false";
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                if (i == 0 || i == str.length() - 1 || str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
                    return "false";
                }
            }
        }
        return "true";
    }

    public static String stringChallenge(String[] strArr) {
        String input = strArr[0];

        String[] parts = input.split("\\.");
        if (parts.length > 2) {
            return "false";
        }

        if (!isValidIntegerPart(parts[0])) {
            return "false";
        }

        if (parts.length == 2 && !isValidDecimalPart(parts[1])) {
            return "false";
        }

        return "true";
    }

    private static boolean isValidIntegerPart(String integerPart) {
        String[] groups = integerPart.split(",");

        if (groups.length > 0 && groups[0].length() > 3) {
            return false;
        }

        for (int i = 1; i < groups.length; i++) {
            if (groups[i].length() != 3) {
                return false;
            }
        }

        for (String group : groups) {
            if (!group.chars().allMatch(Character::isDigit)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidDecimalPart(String decimalPart) {
        return decimalPart.chars().allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println(stringChallenge(new String[]{"0.232567"})); // true
        System.out.println(stringChallenge(new String[]{"2,567.00.2"})); // false
        System.out.println(stringChallenge(new String[]{"1,093,222.04"})); // true
        System.out.println(stringChallenge(new String[]{"1,093,22.04"})); // false
    }
}
