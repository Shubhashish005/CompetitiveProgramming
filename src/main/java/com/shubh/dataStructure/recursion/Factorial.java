package com.shubh.dataStructure.recursion;

import static java.lang.System.out;

public class Factorial {

    int fact = 1;
    private int calFactorial(int n){
        if(n==1)
            return fact;

        return n * calFactorial(n-1);
    }

    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        out.println("Factorial >> " + factorial.calFactorial(6));
    }
}
