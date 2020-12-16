package com.shubh.dataStructure.LinkedList;

import static java.lang.System.out;

class Node {

    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedList {

    private Node head;

    void insertData(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    void insertDataAtIndex(int index, int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
//25 -> 0, 20 -> 1, 10 -> 2, 50 -> 3, 70 -> 4
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node temp = current;
        current = new Node(data);
        current.next = temp;
    }

    void insertDataAtStart(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        head = new Node(data);
        head.next = current;
    }

    void deleteData(int data) {
        if (head == null) {
            out.println("Empty List");
            return;
        }

        if (head.data == data) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                break;
            }

            current = current.next;
        }
    }

    void showData() {

        Node current = head;
        while (current.next != null) {
            out.print(current.data + "->");
            current = current.next;
        }
        out.print(current.data + "\n");
    }
}
