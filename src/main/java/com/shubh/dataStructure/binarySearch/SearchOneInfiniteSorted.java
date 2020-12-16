package com.shubh.dataStructure.binarySearch;

public class SearchOneInfiniteSorted {

    private static final int arr[] = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    private static final int key = 1;

    private int retrieveFirstOccurance() {

        int start = 0;
        int end = 1;

        while (key > arr[end]) {
            start = end;
            end = end * 2;
        }

        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                result = mid;
                end = mid - 1;
            } else if (key < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        SearchOneInfiniteSorted searchOneInfiniteSorted = new SearchOneInfiniteSorted();
        int firstOccurance = searchOneInfiniteSorted.retrieveFirstOccurance();
        System.out.println("firstOccuranceOfOne >> " + firstOccurance);
    }
}
