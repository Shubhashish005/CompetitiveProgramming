package com.shubh.dataStructure.LinkedList;

public class ReverseLinkedList {

    // 5y -> 4 -> 3
    public static Node reverseLinkedList(Node head) {

        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
