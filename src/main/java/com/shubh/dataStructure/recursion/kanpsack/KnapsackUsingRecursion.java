package com.shubh.dataStructure.recursion.kanpsack;

/*
    Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
    In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively.
    Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W.
    You cannot break an item, either pick the complete item or don’t pick it (0-1 property).
 */
public class KnapsackUsingRecursion {

    private int getMaxProfit(int[] weightArray, int[] valueArray, int capacity, int weightArrayLength) {

        if (weightArrayLength == 0 || capacity == 0)
            return 0;

        if(weightArray[weightArrayLength-1] > capacity)
            return getMaxProfit(weightArray, valueArray, capacity, weightArrayLength-1);

        else
            return Math.max(
                        valueArray[weightArrayLength-1] + getMaxProfit(weightArray, valueArray, capacity - weightArray[weightArrayLength-1], weightArrayLength-1),
                        getMaxProfit(weightArray, valueArray, capacity, weightArrayLength-1)
                );
    }

    public static void main(String[] args) {

        int CAPACITY = 50;
        int[] weightArray = {10, 40, 30};
        int[] valueArray = {60, 100, 120};
        int weightArrayLength = weightArray.length;

        KnapsackUsingRecursion knapsackUsingRecursion = new KnapsackUsingRecursion();
        int maxProfit = knapsackUsingRecursion.getMaxProfit(weightArray, valueArray, CAPACITY, weightArrayLength);
        System.out.println("Max Profit >> " + maxProfit);
    }
}
