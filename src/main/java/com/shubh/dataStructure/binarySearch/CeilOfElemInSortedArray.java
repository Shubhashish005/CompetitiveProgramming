package com.shubh.dataStructure.binarySearch;

public class CeilOfElemInSortedArray {

    private static final int[] arr = {1, 2, 3, 4, 8, 10, 10, 12, 19};
    private static final int elementToBeSearched = 13;

    private int getCeilOfAnElement(int start, int end){
        int result=-1;
        while (start<=end){
            int mid = (start+end)/2;

            if (elementToBeSearched == arr[mid])
                return arr[mid];
            else if (arr[mid] <= elementToBeSearched)
                start = mid +1;
            else if (arr[mid] >= elementToBeSearched){
                result = arr[mid];
                end = mid-1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        CeilOfElemInSortedArray ceilOfElemInSortedArray = new CeilOfElemInSortedArray();
        int ceilOfAnElement = ceilOfElemInSortedArray.getCeilOfAnElement(0, arr.length - 1);
        System.out.println("ceilOfAnElement > " + ceilOfAnElement);
    }
}
