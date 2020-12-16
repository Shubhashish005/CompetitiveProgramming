package com.shubh.leetcode.binarySearch;

public class SearchInsertPosition {

    private static final int[] arr = {1,3};

    private int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
        }

        if (end < 0)
            return 0;

        return (target > arr[end]) ? end + 1 : end;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int insertPosition = searchInsertPosition.searchInsert(arr, 0);
        System.out.println("insertPosition >> " + insertPosition);
    }
}
