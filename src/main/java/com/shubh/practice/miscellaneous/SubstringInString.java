package com.shubh.practice.miscellaneous;

public class SubstringInString {

    public static void main(String[] args) {

        String str = "123";

        printSubString(str);
    }

    private static void printSubString(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
