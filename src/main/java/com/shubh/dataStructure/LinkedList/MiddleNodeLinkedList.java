package com.shubh.dataStructure.LinkedList;

public class MiddleNodeLinkedList {

    /*
     * It'll find the middle node of the linked list
     * 12, 99, 37, 8, 18
     */
    public static Node middleNode(Node node) {
        if (node == null) {
            return null;
        }

        Node firstCursor = node;
        Node secondCursor = node.next;

        while (secondCursor != null && secondCursor.next != null) {
            firstCursor = firstCursor.next;
            secondCursor = secondCursor.next.next;
        }

        return firstCursor;
    }
}
