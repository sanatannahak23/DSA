package com.tp.DSA;

import java.util.LinkedHashMap;

class Node {
    Object value;
    Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class RecursiveLinkedList {

    public static Boolean isRecursive(Node nodeFour) {

        Node curr = nodeFour;
        LinkedHashMap<Node, Integer> map = new LinkedHashMap<>();

        while (curr.next != null) {
            if (map.getOrDefault(curr, 0) > 1) return Boolean.TRUE;
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            curr = curr.next;
        }
        return Boolean.FALSE;
    }

    public static void main(String[] args) {
        Node nodeOne = new Node(10, null);
        Node nodeTwo = new Node(20, nodeOne);
        Node nodeThree = new Node(30, nodeTwo);
        Node nodtFour = new Node(40, nodeThree);
//        nodeOne.next = nodtFour;

        System.out.println(isRecursive(nodtFour));
    }
}
