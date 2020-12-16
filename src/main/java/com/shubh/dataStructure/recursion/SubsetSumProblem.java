package com.shubh.dataStructure.recursion;

/*
    Given a set of non-negative integers, and a value sum,
        determine if there is a subset of the given set with sum equal to given sum.
*/
public class SubsetSumProblem {

    private static final int[] arr = {1, 2, 3};
    private static final int SUM = 5;
    private static boolean statusArray[][] = null;

    private Boolean isSubsetSum(int length){
        initializeStatusArray(length);

        for (int i=1; i<=length; i++){
            for (int j=1; j<=SUM; j++){
                if (arr[i-1] > j)
                    statusArray[i][j] = statusArray[i-1][j];

                else
                    statusArray[i][j] = statusArray[i-1][j] || statusArray[i-1][j - arr[i-1]];
            }
        }

        return statusArray[length][SUM];
    }

    private void initializeStatusArray(int length) {
        statusArray = new boolean[length + 1][SUM + 1];
        for (int i=0; i < length + 1; i ++){
            for (int j=0; j<SUM+1; j++){
                if (i== 0)
                    statusArray[i][0] = Boolean.TRUE;
            }
        }
    }

    public static void main(String[] args) {

        int length = arr.length;
        SubsetSumProblem subsetSumProblem = new SubsetSumProblem();
        Boolean subsetSum = subsetSumProblem.isSubsetSum(length);
        System.out.println("Is Subset Sum Possible " + subsetSum);
    }
}
