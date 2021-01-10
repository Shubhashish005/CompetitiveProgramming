package com.shubh.hackerearth;


import com.shubh.hackerearth.utility.InputReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumProfit {

    public static int maxProfit(List<Integer> arr, int maxMoves) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Iterator value = arr.iterator();

        while (value.hasNext()) {
            if (!priorityQueue.contains(value.next())) {
                priorityQueue.add((Integer) value.next());
            }
            if (priorityQueue.size() > maxMoves) {
                priorityQueue.remove();
            }
        }

        return priorityQueue.parallelStream().distinct().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) throws IOException {

        InputReader inputReader = new InputReader(System.in);
        System.out.println("No of test cases");
        int testCase = inputReader.nextInt();
        StringBuilder result = new StringBuilder();
        List<Integer> arr = new ArrayList<>();

        while (testCase-- > 0) {
            System.out.println("numberOfCoin");
            int numberOfCoin = inputReader.nextInt();
            System.out.println("maxMoves");
            int maxMoves = inputReader.nextInt();
            arr.clear();
            System.out.println("enter array elements");
            for (int j = 0; j < numberOfCoin; j++) {
                arr.add(inputReader.nextInt());
            }
            result.append(maxProfit(arr, maxMoves));
            result.append("\n");
        }
        System.out.print(result);
    }
}
