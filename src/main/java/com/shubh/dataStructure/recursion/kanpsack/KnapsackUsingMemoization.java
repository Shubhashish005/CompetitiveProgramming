package com.shubh.dataStructure.recursion.kanpsack;

public class KnapsackUsingMemoization {

    private static final int[][] t = new int[102][1002];
    private static final int[] weightArray = {10, 40, 30};
    private static final int[] valueArray = {60, 100, 120};

    private int getMaxProfit(int capacity, int weightArrayLength){

        if (weightArray[weightArrayLength-1] > capacity)
            return getMaxProfit(capacity, weightArrayLength-1);

        return 1;


    }

    public static void main(String[] args) {

        int CAPACITY = 50;
        int weightArrayLength = weightArray.length;

        KnapsackUsingMemoization knapsackUsingMemoization = new KnapsackUsingMemoization();
        knapsackUsingMemoization.getMaxProfit(CAPACITY, weightArrayLength);
    }

}
