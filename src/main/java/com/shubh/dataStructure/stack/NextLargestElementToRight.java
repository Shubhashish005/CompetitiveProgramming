package com.shubh.dataStructure.stack;

import java.util.Stack;
import java.util.Vector;

public class NextLargestElementToRight {

    private static final int arr[] = {1, 3, 0, 0, 1, 2, 4};

    private Vector<Integer> resultArray = new Vector<>(arr.length);
    private Stack<Integer> stack = new Stack<>();

    private Vector<Integer> getNextLargestForEach() {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.empty())
                resultArray.add(-1);
            else if (stack.peek() > arr[i]) {
                resultArray.add(stack.peek());
            } else if (stack.peek() < arr[i]) {
                while (stack.peek() < arr[i]) {
                    stack.pop();
                }
                if (stack.empty())
                    resultArray.add(-1);
                else
                    resultArray.add(stack.peek());
            }
            stack.push(arr[i]);
        }

        return resultArray;

    }

    public static void main(String[] args) {
        NextLargestElementToRight nextLargestElementToRight = new NextLargestElementToRight();
        Vector<Integer> nextLargestForEach = nextLargestElementToRight.getNextLargestForEach();
        nextLargestForEach.stream().forEach(System.out::print);
        System.out.println();
    }
}
