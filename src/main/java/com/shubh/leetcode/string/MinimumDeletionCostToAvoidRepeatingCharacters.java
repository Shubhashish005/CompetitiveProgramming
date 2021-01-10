package com.shubh.leetcode.string;

public class MinimumDeletionCostToAvoidRepeatingCharacters {

    private static final String S = "aaabbbabbbb";
    private static final int[] C = {3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1};

    private static int solution() {

        int sum = 0;
        int ans = 0;
        int max = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i > 0 && S.charAt(i) != S.charAt(i - 1)) {
                ans = ans + (sum - max);
                sum = 0;
                max = 0;
            }
            sum = sum + C[i];
            max = Math.max(max, C[i]);
        }

        ans = ans + (sum - max);
        return ans;
    }

    public static void main(String[] args) {

        int solution = solution();
        System.out.println(solution);
    }
}
