package com.shubh.dataStructure.binarySearch;

import java.util.Arrays;

public class FirstAndLastOccurance {

    private static final int[] arr = {2, 4, 10, 10, 10, 12, 13, 14, 15, 16, 17};
    private static final int numberToBeSearched = 10;

    public int[] searchRange(int[] nums, int target) {
        if (nums.length > 0) {
             return new int[]{findFirstOccurance(nums, 0, nums.length - 1, target), findLastOccurance(nums, 0, nums.length - 1, target)};
        }

        return new int[]{-1, -1};
    }


    private int findFirstOccurance(int arr[], int start, int end, int numberToBeSearched) {

        int result = -1;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == numberToBeSearched) {
                result = mid;
                end = mid - 1;
            } else if (numberToBeSearched < arr[mid]) {
                end = mid - 1;
            } else if (numberToBeSearched > arr[mid]) {
                start = mid + 1;
            }
        }

        return result;
    }

    private int findLastOccurance(int arr[], int start, int end, int numberToBeSearched) {
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == numberToBeSearched) {
                result = mid;
                start = mid + 1;
            } else if (numberToBeSearched < arr[mid]) {
                end = mid - 1;
            } else if (numberToBeSearched > arr[mid]) {
                start = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        FirstAndLastOccurance firstAndLastOccurance = new FirstAndLastOccurance();
        System.out.println(Arrays.toString(firstAndLastOccurance.searchRange(arr, numberToBeSearched)));
    }

}
