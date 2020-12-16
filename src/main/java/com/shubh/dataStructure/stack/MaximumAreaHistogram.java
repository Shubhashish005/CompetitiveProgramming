package com.shubh.dataStructure.stack;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class MaximumAreaHistogram {

    private static final int arr[] = {6, 2, 5, 4, 5, 1, 6};
    private Vector<Integer> resultArray = new Vector<>(arr.length);
    private Stack<Pair<Integer, Integer>> stack = new Stack<>();

    private Vector<Integer> getNearestSmallestElementToLeftForEach(){

        for (int i=0; i<arr.length; i++){

            if (stack.empty())
                resultArray.add(-1);
            else if (stack.peek().getValue() < arr[i])
                resultArray.add(stack.peek().getKey());
            else if (stack.peek().getValue() > arr[i]){
                while (!stack.empty() && stack.peek().getValue() > arr[i]){
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

    private Vector<Integer> getNearestSmallestElementToRightForEach(){

        for (int i=arr.length-1; i>=0; i--){

            if (stack.empty())
                resultArray.add(arr.length);
            else if (stack.peek().getValue() < arr[i])
                resultArray.add(stack.peek().getKey());
            else if (stack.peek().getValue() > arr[i]){
                while (!stack.empty() && stack.peek().getValue() > arr[i]){
                    stack.pop();
                }
                if (stack.empty())
                    resultArray.add(arr.length);
                else
                    resultArray.add(stack.peek().getKey());
            }

            stack.push(Pair.of(i, arr[i]));
        }

        Collections.reverse(resultArray);

        return resultArray;
    }

    public static void main(String[] args) {
        MaximumAreaHistogram maximumAreaHistogram = new MaximumAreaHistogram();
        Vector<Integer> nearestSmallestElementToLeftForEach = maximumAreaHistogram.getNearestSmallestElementToLeftForEach();
        Vector<Integer> nearestSmallestElementToRightForEach = maximumAreaHistogram.getNearestSmallestElementToRightForEach();

        System.out.println("nearestSmallestElementToRightForEach.get(i) >> " + nearestSmallestElementToRightForEach.get(0));
        System.out.println("nearestSmallestElementToLeftForEach.get(i) >> " + nearestSmallestElementToLeftForEach.get(0));

        Vector<Integer> widthArray = new Vector<>(nearestSmallestElementToLeftForEach.capacity());
        for (int i=0; i<widthArray.capacity(); i++){
            System.out.println("nearestSmallestElementToRightForEach.get(i) >> " + nearestSmallestElementToRightForEach.get(i));
            System.out.println("nearestSmallestElementToLeftForEach.get(i) >> " + nearestSmallestElementToLeftForEach.get(i));
            widthArray.set(i, (nearestSmallestElementToRightForEach.get(i) - nearestSmallestElementToLeftForEach.get(i) - 1));
        }

        System.out.println();

        System.out.println("After ------ ");
        widthArray.stream()
                .forEach(System.out::print);

        System.out.println();

    }
}
