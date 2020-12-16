package com.shubh.dataStructure.heap;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    private static final int arr[] = {1, 1, 1, 1, 3, 2, 2, 2, 4, 4};

    private void frequencySort(){

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Pair<Integer, Integer>> pairPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        frequencyMap.forEach((key, value) -> {
            pairPriorityQueue.add(Pair.of(value, key));
        });

        while (!pairPriorityQueue.isEmpty()) {
            System.out.println(pairPriorityQueue.peek().getRight());
            pairPriorityQueue.remove();
        }
    }

    public static void main(String[] args) {

        FrequencySort frequencySort = new FrequencySort();
        frequencySort.frequencySort();
    }
}
