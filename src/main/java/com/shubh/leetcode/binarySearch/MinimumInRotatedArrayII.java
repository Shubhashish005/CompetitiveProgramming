package com.shubh.leetcode.binarySearch;

public class MinimumInRotatedArrayII {

    private static final int[] arr = {1,-1};

    private int findMin(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        if (nums.length == 1)
            return nums[0];

        while (start <= end){
            int mid = (start + end)/2;
            int previous = (mid -1 + nums.length) % nums.length;
            int next = (mid + 1) % nums.length;

            if (nums[start] < nums[end])
                return arr[start];

            if (nums[mid] < nums[previous] && nums[mid] < nums[next])
                return nums[mid];
            else if (nums[mid] > nums[start])
                start = mid + 1;
            else if (nums[mid] < nums[end])
                end = mid-1;
        }
        return nums.length == 1 ? nums[0] : -1;
    }

    public static void main(String[] args) {

        MinimumInRotatedArrayII minimumInRotatedArrayII = new MinimumInRotatedArrayII();
        int minElement = minimumInRotatedArrayII.findMin(arr);
        System.out.println("minElement >> " + minElement);
    }
}
