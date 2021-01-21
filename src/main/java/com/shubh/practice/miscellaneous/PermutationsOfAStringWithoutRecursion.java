package com.shubh.practice.miscellaneous;

import java.util.Scanner;

/*

Number of Permutations possible of a string of length n = n!
 */

public class PermutationsOfAStringWithoutRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string >> ");
        String str = scanner.next();

        permutationOfANumber(str);
    }

    private static void permutationOfANumber(String str) {
        int factorial = factorial(str.length());
        int length = str.length();

        for (int i = 0; i < factorial; i++) {
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for (int j = length; j > 0; j--) {
                int quotient = temp / j;
                int remainder = temp % j;

                System.out.print(sb.charAt(remainder));
                sb.deleteCharAt(remainder);

                temp = quotient;
            }

            System.out.println();
        }
    }

    public static int factorial(int length) {
        int fact = 1;
        for (int i = 2; i <= length; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
