package com.shubh.hackerrank;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Enter String");
//            String s = scanner.next();
//            System.out.println("Enter number of repetitions");
//            Long n = scanner.nextLong();
            long times = repeatedString("aba", 10);
            System.out.println(times);
        }
    }
    private static long repeatedString(String s, long n) {
        int stringLength = s.length();
        long q=0, r=0;
        q = n/stringLength;
        r = n % stringLength;
        return q * getCharacterFrequency(s, s.length()) + getCharacterFrequency(s, r);

    }
    private static int getCharacterFrequency(String s, long upto){
        int count = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < upto; i++) {
            char character = charArray[i];
            if (character == 'a')
                count++;
        }
        return count;
    }
}
