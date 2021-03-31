package com.shubh.dataStructure.LinkedList;

import static com.shubh.dataStructure.LinkedList.MergeLinkedList.mergeLinkedLists;
import static com.shubh.dataStructure.LinkedList.MiddleNodeLinkedList.middleNode;

public class SortLinkedList {

    public static Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node middleNode = middleNode(node);
        Node secondHalf = middleNode.next;
        middleNode.next = null;

        return mergeLinkedLists(mergeSort(node), mergeSort(secondHalf));
    }
}
