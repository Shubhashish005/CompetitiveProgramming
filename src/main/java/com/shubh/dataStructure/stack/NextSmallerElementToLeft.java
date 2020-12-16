package com.shubh.dataStructure.stack;

import java.util.Stack;
import java.util.Vector;

public class NextSmallerElementToLeft {

    private static final int arr[] = {4, 5, 2, 10, 8};
    private Vector<Integer> resultArray = new Vector<>(arr.length);
    private Stack<Integer> stack = new Stack<>();

    private Vector<Integer> getNextSmallerForEach() {

        for (int i = 0; i < arr.length; i++) {
            if (stack.empty())
                resultArray.add(-1);
            else if (stack.peek() < arr[i]) {
                resultArray.add(stack.peek());
            } else if (stack.peek() > arr[i]) {
                while (!stack.empty() && stack.peek() > arr[i]) {
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

        NextSmallerElementToLeft nextSmallerElementToLeft = new NextSmallerElementToLeft();
        nextSmallerElementToLeft.getNextSmallerForEach().stream().forEach(System.out::print);
        System.out.println();
    }
}
