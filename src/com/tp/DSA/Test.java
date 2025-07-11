package com.tp.DSA;

import java.io.FilterOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
//        CustomLinkedList<Integer> list = new CustomLinkedList<>();
//        list.add(25);
//        list.add(35);
//        list.add(55);
//        list.add(5, 0);
//        list.add(15, 3);
//        list.print();
//        System.out.println("-----------------------------------------");
//        list.reverse();
//        list.remove(2);
//        list.print();
//        System.out.println(list.getSize());

//        CustomHashMap<Integer, Character> map = new CustomHashMap<>();
//        map.put(5, 'f');
//        map.put(6, 's');
//        map.put(66, 's');
//        map.put(6, 'i');
//        map.put(7, 'e');
//        map.put(11, 'e');
//        map.put(55, 'f');
//        map.remove(11);
//        System.out.println(map.size());
//        map.print();

//        System.out.println(map.get(55));
//        System.out.println(map.keys());

        CustomBinaryTree tree = new CustomBinaryTree();
        tree.add(5);
        tree.add(2);
        tree.add(6);
        tree.add(2);
        tree.add(4);
        tree.add(7);
//        tree.levelOrder();
        System.out.println(tree.find());
//        tree.remove(5);
//        System.out.println(tree.size());
//        tree.levelOrder();
//        tree.postOrder();
//        tree.inOrder();
//        tree.preOrder();
    }
}
