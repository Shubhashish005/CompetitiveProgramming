package com.shubh.practice.array;

public class Largest2ndLargest {

    private static final int[] arr = {3, 5, 2, 8, 4, 6};

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;





        for (int element : arr) {

            if (element > max) {
                secondMax = max;
                max = element;
            } else if (element > secondMax && element != max) {
                secondMax = element;
            }
        }

        System.out.println("Maximum >> " + max);
        System.out.println("secondMaximum >> " + secondMax);

    }
}
