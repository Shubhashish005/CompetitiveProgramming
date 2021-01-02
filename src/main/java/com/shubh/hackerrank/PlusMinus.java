package com.shubh.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class PlusMinus {

    private static final int[] arr = {1, -2, -7, 9, 1, -8, -5};

    public static void main(String[] args) {
        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        Map<String, Float> values = new HashMap<>();
        for (int number : arr) {
            String field = checkPositiveNegativeZero(number);
            values.put(field, values.getOrDefault(field, 0f) + 1f);
        }

        int len = arr.length;
        System.out.printf("%1.6f\n", values.getOrDefault("POSITIVE", 0f) / len);
        System.out.printf("%1.6f\n", values.getOrDefault("NEGATIVE", 0f) / len);
        System.out.printf("%1.6f\n", values.getOrDefault("ZERO", 0f) / len);
    }

    private static String checkPositiveNegativeZero(int number) {
        return number > 0 ? "POSITIVE" : (number < 0 ? "NEGATIVE" : "ZERO");
    }
}
