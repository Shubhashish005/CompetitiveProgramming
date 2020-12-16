package com.shubh.dataStructure.heap;


import org.apache.commons.lang3.tuple.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ClosestNumbers {

    private static final int arr[] = {5, 6, 7, 8, 9};
    private static final int element = 7;
    private static final int key = 3;

    private void getClosestNumbersToElement(){

        PriorityQueue<Pair<Integer, Integer>> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i=0; i < arr.length; i++){

            priorityQueue.add(Pair.of(Math.abs(arr[i] - element), arr[i]));
            if (priorityQueue.size() > key)
                priorityQueue.remove();
        }

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.peek().getRight());
            priorityQueue.remove();
        }
    }

    public static void main(String[] args) {

        ClosestNumbers closestNumbers = new ClosestNumbers();
        closestNumbers.getClosestNumbersToElement();
    }
}
