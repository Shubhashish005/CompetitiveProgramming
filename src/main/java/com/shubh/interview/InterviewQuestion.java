package com.shubh.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewQuestion {

    private static int[] arr = {10, 1, 17, 5, 6, 3};
    private static int targetSum = 6;

    public static void main(String[] args) {


    }

    private void getTargetSumIndexes() {

        Map<Integer, Integer> hmap = new HashMap<>();
        List<Integer> integers = Arrays.asList(10, 1, 17, 5, 6, 3);
        StringBuilder sb = new StringBuilder();
        int result = 0;
        for (int i = 0; i < integers.size(); i++) {
            result = targetSum - arr[i];
            if (hmap.get(result) == null) {
                hmap.put(arr[i], i);
            } else {
                sb.append(i);
                sb.append(hmap.get(result));
            }

        }


    }
}
