package com.shubh.leetcode.string;

public class MinimumDeletionCostToAvoidRepeatingCharactersUsingRecursion {

    private static final String S = "aaabbbabbbb";
    private static final int[] C = {3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1};
    static int sum = 0;
    static int max = 0;
    static int ans = 0;

    private static int solution(int x) {

        if (x == 0) {
            sum = sum + C[x];
            max = Math.max(max, C[x]);
            solution(x + 1);
        }
        if (x == S.length())
            return ans;

        if (x > 0 && S.charAt(x) != S.charAt(x - 1)) {
            ans = ans + (sum - max);
            sum = 0;
            max = 0;
            solution(x + 1);
        } else if (x > 0 && x < S.length()) {
            sum = sum + C[x];
            max = Math.max(max, C[x]);
            solution(x + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int solution = solution(0);
        System.out.println(solution);

    }
}
