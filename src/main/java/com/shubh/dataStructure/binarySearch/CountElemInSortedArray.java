package com.shubh.dataStructure.binarySearch;

public class CountElemInSortedArray {

    private static final int[] arr = {2, 4, 10, 10, 10, 12, 13, 14, 15, 16, 17};
    private static final int numberToBeSearched = 10;

    private int getFirstOccurance(int start, int end) {

        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numberToBeSearched == arr[mid]) {
                result = mid + 1;
                end = mid - 1;
            } else if (numberToBeSearched < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return result;
    }

    private int getLastOccurance(int start, int end) {

        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numberToBeSearched == arr[mid]) {
                result = mid + 1;
                start = mid + 1;
            } else if (numberToBeSearched < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return result;
    }


    private int getCountOfElement(int start, int end) {
        return getLastOccurance(start, end) -
                getFirstOccurance(start, end) + 1;
    }

    public static void main(String[] args) {

        CountElemInSortedArray countElemInSortedArray = new CountElemInSortedArray();
        int countOfElement = countElemInSortedArray.getCountOfElement(0, arr.length - 1);
        System.out.println("countOfElement >> " + countOfElement);
    }
}
