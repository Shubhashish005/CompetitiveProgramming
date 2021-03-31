package com.shubh.dataStructure.LinkedList;

public class InsertLinkedList {

    public static Node insertNode(int key, Node node) {

        if (node == null)
            return getNewNode(key);
        else
            node.next = insertNode(key, node.next);

        return node;
    }

    public static Node getNewNode(int key) {
        Node node = new Node();
        node.data = key;
        node.next = null;
        return node;
    }
}
