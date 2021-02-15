package com.shubh.practice.array;

public class Largest2ndLargest {

    private static final int[] arr = {3, 5, 2, 6, 4, 8};

    public static void main(String[] args) {

        int max = arr[0];
        int secondMax = arr[0];

        for (int element : arr) {
            if (element > max) {
                secondMax = max;
                max = element;
            }
        }

        System.out.println("Maximum >> " + max);
        System.out.println("secondMaximum >> " + secondMax);

    }
}
