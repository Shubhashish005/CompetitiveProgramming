package com.shubh.dataStructure.recursion.commonSubsequence;

import java.util.Scanner;

public class LongestCommonSubsequenceUsingRecursion {
    //abcdgh
    //abedfhr
    private static int longestCommonSubsequence(String s1, String s2, int length1, int length2) {

        if (length1 == 0 || length2 == 0) {
            return 0;
        }

        if (s1.charAt(length1 - 1) == s2.charAt(length2 - 1))
            return 1 + longestCommonSubsequence(s1, s2, length1 - 1, length2 - 1);

        else
            return
                    Math.max(longestCommonSubsequence(s1, s2, length1, length2 - 1),
                            longestCommonSubsequence(s1, s2, length1 - 1, length2));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Strings");
        String string1 = "abcdgh";
        String string2 = "abedfhr";

        int longestCommonSubsequence = longestCommonSubsequence(string1, string2, string1.length(), string2.length());
        System.out.println(longestCommonSubsequence);
    }
}
