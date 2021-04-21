package com.shubh.interview;


class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImplementation {

    Node head;

    public static void main(String[] args) {

        LinkedListImplementation linkedListImplementation = new LinkedListImplementation();
        linkedListImplementation.insertNode(10);
        linkedListImplementation.insertNode(4);
        linkedListImplementation.insertNode(30);
        linkedListImplementation.insertNode(15);

        linkedListImplementation.printList();

    }

    public void insertNode(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }

}
