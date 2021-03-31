package com.shubh.interview.synthesis;

/*
A businessman travels from city a to city b.
In each city he earns revenue which is represented by 2 arrays.
Also given an int cost representing the cost of moving between cities.
The businessman can stay in any city during the day or he/she has an option to move to another city
or stay in same city during night. Find the maximum revenue.

Input: a = [4, 10, 5, 20], b = [1, 20, 30, 5], cost = 10
Output: 61
 */

import org.apache.commons.lang3.BooleanUtils;

public class TravellingBusiness {

    static int maxRevenue = 0;
    static Boolean pointerForCityA = null;
    static int cost = 10;

    public static void main(String[] args) {

        int cityA[] = new int[]{4, 10, 5, 20};
        int cityB[] = new int[]{1, 20, 30, 5};
        //int maxRevenueResult = maxRevenue(cityA, cityB, cityA.length - 1, cityB.length - 1);
        int maxRevenueResult = maximizeRevenue(cityA, cityB, cost);
        System.out.println(maxRevenueResult);
    }

    private static int maxRevenue(int[] cityA, int[] cityB, int lengthA, int lengthB) {
        if (lengthA == -1 || lengthB == -1) {
            return maxRevenue;
        }
        if (cityA[lengthA] > cityB[lengthB]) {
            if (BooleanUtils.isFalse(pointerForCityA)) {
                Math.max(maxRevenue + cityB[lengthB], cost - cityA[lengthA]);
            }

            if (BooleanUtils.isFalse(pointerForCityA))
                maxRevenue = maxRevenue - cost;

            pointerForCityA = true;
            maxRevenue = maxRevenue + cityA[lengthA];
        } else {
            if (BooleanUtils.isTrue(pointerForCityA))
                maxRevenue = maxRevenue - cost;

            pointerForCityA = false;
            maxRevenue = maxRevenue + cityB[lengthB];
        }


        return maxRevenue(cityA, cityB, lengthA - 1, lengthB - 1);
    }


    //a = [4, 10, 5, 20],
    // b = [1, 20, 30, 5]
    public static int maximizeRevenue(int[] a, int[] b, int cost) {
        int N = a.length;
        int maxProfitInA = a[0], maxProfitInB = b[0];
        for (int i = 1; i < N; ++i) {
            int temp = maxProfitInA;
            maxProfitInA = Math.max(maxProfitInA + a[i], maxProfitInB - cost + a[i]);
            maxProfitInB = Math.max(temp + b[i] - cost, maxProfitInB + b[i]);
        }
        return Math.max(maxProfitInA, maxProfitInB);
    }
}
