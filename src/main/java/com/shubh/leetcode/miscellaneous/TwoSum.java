package com.shubh.leetcode.miscellaneous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] sumArray = twoSum(arr, target);
        System.out.println(Arrays.toString(sumArray));
    }

    private static int[] twoSum(int[] nums, int target) {

        int delta;
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            delta = target - nums[i];

            if (numMap.containsKey(delta)) {
                int[] ints = {i, numMap.get(delta)};
                Arrays.sort(ints);
                return ints;
            }

            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
