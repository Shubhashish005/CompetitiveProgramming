package com.shubh.leetcode.string;

public class MinimumDeletionCostToAvoidRepeatingCharacters_RP {

    private static final String S = "aaabbb";
    private static final int[] C = {3, 4, 5, 3, 4, 5};

    private static int solution() {

        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j < S.length(); j++) {
                if (S.charAt(i) == S.charAt(j) && j == i + 1) {
                    if (C[i] > C[j]) {
                        sum += C[j];
                    } else {
                        sum += C[i];
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int solution = solution();
        System.out.println("Solution > " + solution);
    }
}
