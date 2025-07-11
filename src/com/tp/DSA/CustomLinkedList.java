package com.tp.DSA;

public class CustomLinkedList<T> {

    public int getSize() {
        return count;
    }

    private class Node {
        Node prev;
        Node next;
        T key;

        public Node(Node prev, T key, Node next) {
            this.prev = prev;
            this.next = next;
            this.key = key;
        }

        public Node(T key) {
            this.key = key;
        }
    }

    private Node root;
    private Integer count = 0;

    public T add(T key) {
        if (root == null) {
            root = new Node(key);
            count++;
            return key;
        }
        Node curr = root;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(curr, key, null);
        count++;
        return key;
    }

    public T add(T key, int index) {
        if (index >= getSize() || index < 0) throw new RuntimeException("Invalid index..");
        if (index == 0) {
            root = new Node(null, key, root);
            root.next.prev = root;
            count++;
            return key;
        }
        Node curr = root;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        Node temp = new Node(curr, key, curr.next);
        curr.next.prev = temp;
        curr.next = temp;
        count++;
        return key;
    }

    public T remove(int index) {
        if (index >= getSize() || index < 0) throw new RuntimeException("Invalid index..");
        if (index == 0) {
            root = root.next;
            root.prev = null;
            count--;
            return root.key;
        }
        Node curr = root;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        if (curr.next != null) {
            curr.next.prev = curr;
        }
        count++;
        return curr.key;
    }

    public void reverse() {
        Node curr = root;
        Node next;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        root = prev;
    }

    public void print() {
        Node curr = root;
        while (curr != null) {
            System.out.print(curr.key + "\t");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Once upon a time");
    }
}
