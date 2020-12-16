package com.shubh.dataStructure.heap;

import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFrequenceNumbers {

    private static final int arr[] = {1, 1, 1, 3, 2, 2, 4};
    private static final int key = 2;

    private void getTopKFrequentNumbers() {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<Pair<Integer, Integer>> priorityQueue = new PriorityQueue<>();
        frequencyMap.forEach((key1, value) -> {
            priorityQueue.add(Pair.of(value, key1));
            if (priorityQueue.size() > key)
                priorityQueue.remove();
        });

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.peek().getRight());
            priorityQueue.remove();
        }
    }

    public static void main(String[] args) {

        TopKFrequenceNumbers topKFrequenceNumbers = new TopKFrequenceNumbers();
        topKFrequenceNumbers.getTopKFrequentNumbers();
    }
}
