package com.shubh.dataStructure.tree;

import java.util.Scanner;

class Node{

    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }
}

public class TreeImplementation {

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        TreeImplementation treeImplementation = new TreeImplementation();
        treeImplementation.createTree();
    }

    static Scanner scanner = null;
    private Node createTree(){

        Node root = null;
        System.out.println("Enter Data: ");
        int data = scanner.nextInt();
        if (data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter Left Data for Node:" + root.data);
        root.left = createTree();

        System.out.println("Enter Right Data for Node:" + root.data);
        root.right = createTree();

        return root;
    }
}
