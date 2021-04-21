package com.shubh.dataStructure.LinkedList;

import static com.shubh.dataStructure.LinkedList.InsertLinkedList.insertNode;
import static com.shubh.dataStructure.LinkedList.PrintLinkedList.printList;
import static com.shubh.dataStructure.LinkedList.ReverseLinkedList.reverseLinkedList;

public class Runner {

    public static void main(String[] args) {

        Node root = null;
        LinkedList a = new LinkedList();

        root = insertNode(5, root);
        root = insertNode(4, root);
        root = insertNode(3, root);
        root = insertNode(2, root);
        root = insertNode(1, root);

        /*System.out.println("Printing Linked List");
        Node middleNode = middleNode(root);
        System.out.println(middleNode.data);

        System.out.println("--------------------");
        System.out.println("Printing Linked List");
        printList(root);

        System.out.println("--------------------");
        System.out.println("Sorting Linked List");
        Node sorted = mergeSort(root);
        printList(sorted);

        System.out.println("--------------------");
*/
        System.out.println("Reverse a linked List");
        Node reversedLinkedList = reverseLinkedList(root);
        printList(reversedLinkedList);
    }
}
