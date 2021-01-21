package com.shubh.dataStructure.recursion.commonSubsequence;

import java.util.Scanner;

public class LongestCommonSubsequenceUsingMemoization {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Strings");
        String string1 = "abcdgh";
        String string2 = "abedfhr";

        int longestCommonSubsequence = longestCommonSubsequence(string1, string2, string1.length(), string2.length());
        System.out.println(longestCommonSubsequence);
    }

    private static int longestCommonSubsequence(String string1, String string2, int length, int length1) {
        return 0;
    }
}
