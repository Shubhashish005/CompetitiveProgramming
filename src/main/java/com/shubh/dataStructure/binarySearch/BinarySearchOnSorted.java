package com.shubh.dataStructure.binarySearch;

public class BinarySearchOnSorted {

    private static final int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    private boolean checkElementPresent(int start, int end, int elementToBeSearched) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == elementToBeSearched)
                return true;

            else if (elementToBeSearched < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int elementToBeSearched = 11;
        BinarySearchOnSorted binarySearchOnSorted = new BinarySearchOnSorted();
        boolean isPresent = binarySearchOnSorted.checkElementPresent(0, arr.length - 1, elementToBeSearched);
        System.out.println("IsPresent >> " + isPresent);
    }
}
