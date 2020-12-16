package com.shubh.dataStructure.binarySearch;

public class SearchElemInRotatedArray {

    private static final int[] arr = {15, 18, 2, 3, 6, 12, 13, 14};
    private static final int numberToBeSearched = 14;

    private int checkElementPresent(int start, int end) {

        while (start <= end) {

            int mid = (start + end) / 2;

            if (numberToBeSearched == arr[mid])
                return mid;
            else if (numberToBeSearched <= arr[mid])
                end = mid - 1;
            else if (numberToBeSearched >= arr[mid])
                start = mid + 1;
        }

        return -1;
    }

    private int getIndexOfMinimumElement(int start, int end, int length) {

        while (start <= end) {

            if (arr[start] <= arr[end])
                return start;

            int mid = (start + end) / 2;
            int previous = (mid - 1 + length) % length;
            int next = (mid + 1) % length;

            if (arr[previous] >= arr[mid] && arr[mid] <= arr[next])
                return mid;
            else if (arr[mid] >= arr[start])
                start = mid + 1;
            else if (arr[mid] <= arr[end])
                end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        SearchElemInRotatedArray searchElemInRotatedArray = new SearchElemInRotatedArray();
        int indexOfMinimumElement = searchElemInRotatedArray.getIndexOfMinimumElement(0, arr.length - 1, arr.length);
        System.out.println("Minimum Element >> " + indexOfMinimumElement);
        int i = searchElemInRotatedArray.checkElementPresent(0, indexOfMinimumElement - 1);
        int j = searchElemInRotatedArray.checkElementPresent(indexOfMinimumElement, arr.length-1);
        System.out.println("Value if present at Left sorted >> " + i + " Value if present at right sorted >> " + j);
    }
}
