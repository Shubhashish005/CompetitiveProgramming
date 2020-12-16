package com.shubh.dataStructure.recursion.kanpsack;

import static java.lang.Math.max;

public class KnapsackUsingTopDown {

    private static final int[][] temp = new int[4][51];
    private static final int[] weightArray = {10, 40, 30};
    private static final int[] valueArray = {60, 100, 120};

    private void initializeArray(int weightArrayLength) {
        for (int i = 0; i <= weightArrayLength; i++)
            for (int j = 0; j <= weightArrayLength; j++) {
                temp[i][j] = -1;
            }
    }

    private int getMaxValue(int capacity, int weightArrayLength) {

        if (capacity == 0 || weightArrayLength == 0)
            return 0;

        if (weightArray[weightArrayLength - 1] > capacity) {
            return getMaxValue(capacity, weightArrayLength - 1);
        } else {
            temp[weightArrayLength - 1][capacity] =
                    max(
                            valueArray[weightArrayLength - 1] + getMaxValue(capacity - weightArray[weightArrayLength - 1], weightArrayLength - 1),
                            getMaxValue(capacity, weightArrayLength - 1)

                    );
            return temp[weightArrayLength - 1][capacity];
        }
    }

    public static void main(String[] args) {

        int CAPACITY = 50;
        int weightArrayLength = weightArray.length;

        KnapsackUsingTopDown knapsackUsingTopDown = new KnapsackUsingTopDown();
        knapsackUsingTopDown.initializeArray(weightArrayLength);
        int maxValue = knapsackUsingTopDown.getMaxValue(CAPACITY, weightArrayLength);
        System.out.println("Max Value >> " + maxValue);
    }
}
