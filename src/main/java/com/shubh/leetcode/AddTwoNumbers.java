package com.shubh.leetcode;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

public class AddTwoNumbers {

    ListNode l1;
    ListNode l2;
    public void createListNode(int... data){
        for(int val : data){
            l1 = new ListNode(val);

        }
    }
}
