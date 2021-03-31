package com.shubh.dataStructure.LinkedList;

import static com.shubh.dataStructure.LinkedList.InsertLinkedList.insertNode;
import static com.shubh.dataStructure.LinkedList.MiddleNodeLinkedList.middleNode;

public class Runner {

    public static void main(String[] args) {

        Node root = null;
        LinkedList a = new LinkedList();

        root = insertNode(12, root);
        root = insertNode(99, root);
        root = insertNode(37, root);
        root = insertNode(8, root);
        root = insertNode(18, root);

        System.out.println("Printing Linked List");
        Node middleNode = middleNode(root);
        System.out.println(middleNode.data);

        /*System.out.println("Printing Linked List");
        printList(root);
        System.out.println();


        System.out.println("Sorting Linked List");
        Node sorted = mergeSort(root);
        printList(sorted);*/
    }
}
