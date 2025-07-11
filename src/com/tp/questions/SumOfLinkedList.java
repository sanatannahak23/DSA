package com.tp.questions;

import java.util.LinkedList;
import java.util.List;

public class SumOfLinkedList {

    public static void sum(List<Integer> l1, List<Integer> l2) {
        int i = 0, j = 0;
        LinkedList<Integer> sum = new LinkedList<>();

        while (i < l1.size() && j < l2.size()) {
            sum.add(l1.get(i++) + l2.get(j++));
        }
        while (i < l1.size()) sum.add(i++);
        while (j < l2.size()) sum.add(j++);
    }
}
