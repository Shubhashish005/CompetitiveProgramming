package com.shubh.dataStructure.heap;

import java.util.PriorityQueue;

public class KthLargestElement {

    private static final int arr[] = {17, 7, 10, 4, 3, 20, 15};

    private int getKthLargestElement(int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i=0; i<arr.length; i++){

            priorityQueue.add(arr[i]);
            if (priorityQueue.size() > k)
                priorityQueue.remove();
        }

        return priorityQueue.peek();
    }

    public static void main(String[] args) {

        KthLargestElement kthLargestElement = new KthLargestElement();
        int kthElement = kthLargestElement.getKthLargestElement(3);
        System.out.println("kthLargestElement >> " + kthElement);

    }
}
