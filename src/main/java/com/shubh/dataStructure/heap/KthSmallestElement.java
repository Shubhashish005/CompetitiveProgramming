package com.shubh.dataStructure.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {

    private static final int arr[] = {17, 7, 10, 4, 3, 20, 15};

    private int getKthSmallestElement(int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);

            if (priorityQueue.size() > k)
                priorityQueue.remove();
        }

        return priorityQueue.peek();
    }

    public static void main(String[] args) {

        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        int kthElement = kthSmallestElement.getKthSmallestElement(3);
        System.out.println("kthElement >> " + kthElement);
    }
}
