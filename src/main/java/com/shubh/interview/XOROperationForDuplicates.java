package com.shubh.interview;

public class XOROperationForDuplicates {

    public static void main(String[] args) {

        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int length = ar.length;

        System.out.println("Element occurring once is " +
                findSingle(ar, length) + " ");
    }

    private static Integer findSingle(int[] ar, int length) {

        int result = ar[0];
        for (int i = 1; i < length; i++)
            result = result ^ ar[i];

        return result;
    }
}
