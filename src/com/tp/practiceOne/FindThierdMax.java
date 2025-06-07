package com.tp.practiceOne;

public class FindThierdMax {

    public static Integer find(Integer[] nums) {
        Integer first = null, second = null, third = null;

        for (Integer n : nums) {
            if (n.equals(first) || n.equals(second) || n.equals(third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }

        return third == null ? first : third;
    }

    public static void main(String[] args) {
        Integer[] arr = {-2147483648, 1, };
        System.out.println(find(arr));
    }
}
