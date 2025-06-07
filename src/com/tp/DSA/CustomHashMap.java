package com.tp.DSA;

import java.util.HashSet;
import java.util.Set;

public class CustomHashMap<K, V> {

    private class Node {
        Node prev;
        Object key;
        Object value;
        Node next;

        public Node() {
        }

        public Node(Node prev, Object key, Object value, Node next) {
            this.prev = prev;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;
    private Object[] arr;
    private int count;

    public CustomHashMap() {
        arr = new Object[16];
        count = 0;
    }

    public boolean put(K key, V value) {
        int index = Math.abs(key.hashCode() % arr.length);
        if (arr[index] == null) {
            arr[index] = new Node(key, value);
            count++;
            return true;
        }
        Node curr = (Node) arr[index];
        Node prev = null;
        while (curr != null) {
            if (key.equals(curr.key)) {
                curr.value = value;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        if (prev != null) {
            prev.next = new Node(prev, key, value, null);
            count++;
        }
        return true;
    }

    public boolean remove(K key) {
        int index = Math.abs(key.hashCode() % arr.length);
        if (arr[index] == null) throw new RuntimeException("Element is not available..");
        if (((Node) arr[index]).key.equals(key)) {
            arr[index] = null;
            count--;
            return true;
        }
        Node curr = (Node) arr[index];
        Node prev = null;
        while (curr != null) {
            if (key.equals(curr.key)) {
                prev.next = curr.next;
                curr.next.prev = prev;
                count--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    public V get(K key) {
        int index = Math.abs(key.hashCode() % arr.length);
        if (arr[index] == null) throw new RuntimeException("Element is not available..");
        Node curr = (Node) arr[index];

        V value = null;
        while (curr != null) {
            if (key.equals(curr.key)) {
                value = (V) curr.value;
            }
            curr = curr.next;
        }
        return value;
    }

    public Set<K> keys() {
        HashSet<K> keys = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                Node temp = (Node) arr[i];
                while (temp != null) {
                    keys.add((K) temp.key);
                    temp = temp.next;
                }
            }
        }
        return keys;
    }

    public int size() {
        return count;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                Node temp = (Node) arr[i];
                while (temp != null) {
                    System.out.print(temp.key + " and " + temp.value + "\t");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }
}
