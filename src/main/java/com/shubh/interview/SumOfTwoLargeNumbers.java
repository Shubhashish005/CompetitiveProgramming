package com.shubh.interview;

public class SumOfTwoLargeNumbers {

    public static void main(String[] args) {

        String str1 = "12";
        String str2 = "198111";
        System.out.println(findSum(str1, str2));
    }

    private static String findSum(String str1, String str2) {
        String string1 = new StringBuilder(str1).reverse().toString();
        String string2 = new StringBuilder(str2).reverse().toString();

        int n1 = string1.length();
        int n2 = string2.length();

        for (int i = 0; i < n2; i++) {
            int i1 = (str1.charAt(i) - '0');
            System.out.println(i1);
        }

        return "";
    }
}
