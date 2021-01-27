package com.shubh.interview;

import java.util.List;

public class Numbers {

    //private static final int[] intArray = {2,9,4,5,6};
    private static final Integer target = 11;
    static int sum = 0;

    public static void main(String[] args) {

    }

    private static Integer findSubSets(int length, int target) {

        List<Integer> integers = List.of(2, 9, 4, 5, 6);
        int counter = 0;

       /* for (int i=0; i<integers.size(); i++){
            int leftValue = target - integers.get(i);
            if (integers.contains(leftValue)){
                counter++;
            }
        }

        return counter;*/

        length = integers.size();

        if (integers.size() == 0) {
            return 0;
        }
        if (integers.get(length - 1) > target) {
            findSubSets(length - 1, target);
        } else {
            int leftValue = target - integers.get(length);
            if (integers.contains(leftValue)) {
                counter++;
            } else {
                sum += integers.get(length);
                findSubSets(length - 1, leftValue);
            }
        }

        findSubSets(length - 1, 11);

        return null;
    }
}
