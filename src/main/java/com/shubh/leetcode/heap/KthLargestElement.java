package com.shubh.leetcode.heap;

import java.util.PriorityQueue;

public class KthLargestElement {

    private static final int arr[] = {17, 7, 10, 4, 3, 20, 15};

    private int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i=0; i<nums.length; i++){
            priorityQueue.add(nums[i]);
            if (priorityQueue.size() > k)
                priorityQueue.remove();
        }

        return priorityQueue.peek();
    }

    public static void main(String[] args) {


    }
}
