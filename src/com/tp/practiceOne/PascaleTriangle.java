package com.tp.practiceOne;

import java.util.ArrayList;
import java.util.List;

public class PascaleTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    temp.add(j, 1);
                } else {
                    temp.add(j, lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                }
            }
            lists.add(temp);
        }
        return lists;

    }

    public static List<Integer> getRow(int rowIndex) {

        return generate(rowIndex+1).get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
