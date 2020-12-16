package com.shubh.dataStructure.binarySearch;

import static java.lang.Math.*;

public class MinimumDiffElement {

    private static final int arr[] = {1, 3, 8, 10, 15};
    private static final int key = 12;

    private int getMinimumDifference(int start, int end) {

        while (start <= end) {

            int mid = (start + end) / 2;
            if (key == arr[mid])
                return arr[mid];
            else if (key < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        int value1 = abs(arr[start] - key);
        int value2 = abs(arr[end] - key);
        return min(value1, value2);
    }

    public static void main(String[] args) {
        MinimumDiffElement minimumDiffElement = new MinimumDiffElement();
        int minimumDifference = minimumDiffElement.getMinimumDifference(0, arr.length - 1);
        System.out.println("Minimum Difference >> " + minimumDiffElement);
    }
}
