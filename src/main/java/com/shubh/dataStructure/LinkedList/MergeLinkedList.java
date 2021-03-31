package com.shubh.dataStructure.LinkedList;

public class MergeLinkedList {

    /*
     * It'll merge both linked list
     */
    public static Node mergeLinkedLists(Node a, Node b) {
        Node temp = new Node();
        Node finalList = temp;

        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        temp.next = (a == null) ? b : a;
        return finalList.next;
    }
}
