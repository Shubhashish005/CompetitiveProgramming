package com.shubh.dataStructure.LinkedList;

public class PrintLinkedList {

    public static void printList(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " -> ");
        printList(node.next);
    }
}
