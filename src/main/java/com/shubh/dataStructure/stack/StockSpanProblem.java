package com.shubh.dataStructure.stack;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Stack;
import java.util.Vector;

public class StockSpanProblem {

    private static final int arr[] = {100, 80, 60, 70, 60, 75, 85};
    private Vector<Integer> resultArray = new Vector<>(arr.length);
    private Stack<Pair<Integer, Integer>> stack = new Stack<>();

    private Vector<Integer> getConsecutiveSmallerForEach() {

        for (int i = 0; i < arr.length; i++) {

            if (stack.empty())
                resultArray.add(-1);
            else if (stack.peek().getValue() > arr[i]) {
                resultArray.add(stack.peek().getKey());
            } else if (stack.peek().getValue() < arr[i]) {
                while (!stack.empty() && stack.peek().getValue() < arr[i]) {
                    stack.pop();
                }
                if (stack.empty())
                    resultArray.add(-1);
                else
                    resultArray.add(stack.peek().getKey());
            }
            stack.push(Pair.of(i, arr[i]));
        }
        return resultArray;
    }

    public static void main(String[] args) {

        StockSpanProblem stockSpanProblem = new StockSpanProblem();
        Vector<Integer> consecutiveSmallerForEach = stockSpanProblem.getConsecutiveSmallerForEach();

        System.out.println("Before ------ ");
        consecutiveSmallerForEach.stream()
                .forEach(System.out::print);
        System.out.println();

        for (int i=0; i<consecutiveSmallerForEach.size(); i++){
            consecutiveSmallerForEach.set(i, i - consecutiveSmallerForEach.get(i));
        }

        System.out.println("After ------ ");
        consecutiveSmallerForEach.stream()
                .forEach(System.out::print);

        System.out.println();

    }
}
