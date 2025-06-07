package com.tp.practiceOne;

public class RemoveNthNode {

    public int size(ListNode head){
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=size(head);
        if(len==0)return head;
        if(len==n)return head.next;
        ListNode curr=head;
        for (int i = 1; i < len - n; i++) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
        return head;
    }
}
