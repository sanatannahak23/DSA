package com.tp.questions;

public class MergeThreeLIst {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void forEachCheck() {
        ListNode curr = root;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    private ListNode root;
    private Integer count = 0;

    public void add(Integer n) {
        if (root == null) {
            root = new ListNode(n);
            count++;
            return;
        }
        ListNode curr = root;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new ListNode(n);
        count++;
    }

    public ListNode mergeKLists(ListNode[] list) {
        int i = 0, j = 0, k = 0;
        ListNode curr1 = list[0];
        ListNode curr2 = list[1];
        ListNode curr3 = list[2];

        while (curr1 != null && curr2 != null && curr3 != null) {
            if (curr1.val < curr2.val) {
                if (curr1.val < curr3.val) {
                    add(curr1.val);
                    curr1 = curr1.next;
                } else {
                    add(curr3.val);
                    curr3 = curr3.next;
                }
            } else if (curr2.val < curr3.val) {
                add(curr2.val);
                curr2 = curr2.next;
            } else {
                add(curr3.val);
                curr3 = curr3.next;
            }
        }

        while (curr1 != null) {
            add(curr1.val);
            curr1 = curr1.next;
        }

        while (curr2 != null) {
            add(curr2.val);
            curr2 = curr2.next;
        }

        while (curr3 != null) {
            add(curr3.val);
            curr3 = curr3.next;
        }

        return root;
    }

    public static void main(String[] args) {
        //[[1,4,5],[1,3,4],[2,6]]
        MergeThreeLIst l1 = new MergeThreeLIst();
        l1.add(1);
        l1.add(4);
        l1.add(5);
        MergeThreeLIst l2 = new MergeThreeLIst();
        l2.add(1);
        l2.add(3);
        l2.add(4);
        MergeThreeLIst l3 = new MergeThreeLIst();
        l3.add(2);
        l3.add(6);

        MergeThreeLIst result = new MergeThreeLIst();
        MergeThreeLIst[] mergeThreeLIsts = new MergeThreeLIst[3];
//        result.mergeKLists(mergeThreeLIsts);

    }
}
