package com.shubh.practice.miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumInAnArray {

    private static int[] arr = {1, 2, 2, 3, 3};

    private static int getMaximum() {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : arr) {
            if (!priorityQueue.remove(i))
                priorityQueue.add(i);
        }

        return priorityQueue.peek();
    }

    public static void main(String[] args) {

        // int maximum = getMaximum();
        //System.out.println("Maximum 1 > " + maximum);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        Integer integer1 = list.stream()
                .filter(integer -> Collections.frequency(list, integer) == 1)
                .max(Integer::compareTo)
                .get();
        System.out.println(integer1);

    }
}
