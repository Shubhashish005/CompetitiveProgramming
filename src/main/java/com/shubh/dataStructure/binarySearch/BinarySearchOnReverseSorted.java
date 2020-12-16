package com.shubh.dataStructure.binarySearch;

public class BinarySearchOnReverseSorted {

    private static final int[] reverseArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    private boolean checkElementPresent(int start, int end, int elementToBeSearched) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (elementToBeSearched == reverseArr[mid])
                return true;

            else if (elementToBeSearched < reverseArr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int elementToBeSearched = 11;
        BinarySearchOnReverseSorted binarySearchOnReverseSorted = new BinarySearchOnReverseSorted();
        boolean ifPresent = binarySearchOnReverseSorted.checkElementPresent(0, reverseArr.length - 1, elementToBeSearched);
        System.out.println("IfPresent >> " + ifPresent);
    }
}
