package com.shubh.dataStructure.binarySearch;

public class FloorOfEleInSortedArray {

    private static final int[] arr = {1, 2, 3, 4, 8, 10, 10, 12, 19};
    private static final int elementToBeSearched = 11;

    private int getFloorOfAnElement(int start, int end){

        int result = -1;
        while (start <= end){

            int mid = (start + end)/2;
            if (arr[mid] == elementToBeSearched)
                return arr[mid];
            else if (arr[mid] <= elementToBeSearched){
                result = arr[mid];
                start = mid + 1;
            }else if (arr[mid] >= elementToBeSearched)
                end = mid-1;
        }
        return result;
    }

    public static void main(String[] args) {

        FloorOfEleInSortedArray floorOfEleInSortedArray = new FloorOfEleInSortedArray();
        int floorOfAnElement = floorOfEleInSortedArray.getFloorOfAnElement(0, arr.length);
        System.out.println("floorOfAnElement >> " + floorOfAnElement);
    }
}
