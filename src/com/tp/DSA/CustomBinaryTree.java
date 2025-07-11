package com.tp.DSA;

import java.util.LinkedList;
import java.util.Queue;

public class CustomBinaryTree {

    private class Node {
        Node left;
        int key;
        Node right;

        public Node(int key) {
            this.key = key;
        }

        public Node(Node left, int key, Node right) {
            this.left = left;
            this.key = key;
            this.right = right;
        }
    }

    private Node root;
    private int count;
    private boolean flag;

    public boolean add(int key) {
        root = add(root, key);
        return flag;
    }

    private Node add(Node n, int key) {
        if (n == null) {
            count++;
            return new Node(key);
        }
        if (key > n.key) n.right = add(n.right, key);
        else if (key < n.key) n.left = add(n.left, key);
        else {
            flag = false;
        }
        return n;
    }

    public void remove(int key) {
        root = remove(root, key);
    }

    public Node remove(Node n, int key) {
        if (n == null) return n;
        if (key > n.key) n.right = remove(n.right, key);
        else if (key < n.key) n.left = remove(n.left, key);
        else {
            if (n.left == null && n.right == null) n = null;
            else if (n.left == null) n = n.right;
            else if (n.right == null) n = n.left;
            else {
                Node curr = min(n.right);
                int temp = curr.key;
                curr.key = n.key;
                n.key = temp;
                n.right = remove(n.right, key);
            }
        }
        return n;
    }

    public int min() {
        return min(root).key;
    }

    private Node min(Node n) {
        if (n.left == null) return n;
        return min(n.left);
    }

    public int max() {
        return max(root).key;
    }

    private Node max(Node n) {
        if (n.right == null) return n;
        return max(n.right);
    }

    public void levelOrder() {
        Queue queue = new LinkedList();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            Node poll = (Node) queue.poll();
            System.out.println(poll.key);
            if (poll.left != null) queue.add(poll.left);
            if (poll.right != null) queue.add(poll.right);
        }
    }

    public boolean find() {
        Queue<Node> queue = new LinkedList<>();

        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            Node n1 = null;
            Node n2 = null;
            Node poll = queue.poll();
            if (poll.right != null) {
                n1 = poll.right;
                queue.add(n1);
            }
            if (poll.left != null) {
                n2 = poll.left;
                queue.add(n2);
            }
            if (null != n1 && null != n2 && n1.key + n2.key == 9) return true;
        }
        return false;
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node n) {
        if (n == null) return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.println(n.key);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node n) {
        if (n == null) return;
        postOrder(n.left);
        System.out.println(n.key);
        postOrder(n.right);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node n) {
        if (n == null) return;
        System.out.println(n.key);
        postOrder(n.left);
        postOrder(n.right);
    }

    public int size() {
        return count;
    }
}
