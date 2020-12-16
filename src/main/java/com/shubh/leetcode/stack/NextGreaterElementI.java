package com.shubh.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class NextGreaterElementI {

    private static final int[] nums1 = {4, 1, 2};
    private static final int[] nums2 = {1, 3, 4, 2};

    private Vector<Integer> resultArray = new Vector<>(nums1.length);
    private Stack<Integer> stack = new Stack<>();
    private Map<Integer, Integer> resultMap = new HashMap<>();

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for (int i=nums2.length-1; i>=0; i--){
                if (stack.empty())
                    resultMap.put(nums2[i], -1);
                else if (stack.peek() > nums2[i])
                    resultMap.put(nums2[i], stack.peek());
                else if (stack.peek() < nums2[i]){
                    while (!stack.empty() && stack.peek() < nums2[i])
                        stack.pop();
                    if (stack.empty())
                        resultMap.put(nums2[i], -1);
                    else
                        resultMap.put(nums2[i], stack.peek());
                }

                stack.push(nums2[i]);
        }

        for (int num : nums1){
            resultArray.add(resultMap.get(num));
        }

        int[] result = new int[resultArray.size()];
        for (int i = 0; i < resultArray.size(); i++) {
            result[i] = resultArray.get(i);
        }

        return result;

    }

    public static void main(String[] args) {
        NextGreaterElementI nextGreaterElementI = new NextGreaterElementI();

    }


}
