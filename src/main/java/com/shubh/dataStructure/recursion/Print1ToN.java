package com.shubh.dataStructure.recursion;

public class Print1ToN {

    public void print(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }

        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        Print1ToN print1ToN = new Print1ToN();
        print1ToN.print(8);
    }

}
