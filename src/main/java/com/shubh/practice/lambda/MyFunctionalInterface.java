package com.shubh.practice.lambda;

@FunctionalInterface
interface CustomFunctionalInterface {

    int sum(int a, int b);
}

public class MyFunctionalInterface {

    public static void main(String[] args) {
        CustomFunctionalInterface customFunctionalInterface = Integer::sum;
        int sum = customFunctionalInterface.sum(4, 5);
        System.out.println(sum);
    }
}
