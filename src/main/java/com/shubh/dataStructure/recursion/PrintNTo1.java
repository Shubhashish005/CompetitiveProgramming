package com.shubh.dataStructure.recursion;

public class PrintNTo1 {

    public void print(int n){

        if (n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args) {

        PrintNTo1 printNTo1 = new PrintNTo1();
        printNTo1.print(8);
    }
}
