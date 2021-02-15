package com.shubh.interview;

interface Check {

    void m1();

    default void m2() {
        System.out.println("Hello Check Interface");
    }
}

public class InterfaceCheck implements Check {

    public static void main(String[] args) {
        Check check = new InterfaceCheck();
        check.m1();
        check.m2();
    }

    @Override
    public void m1() {
        System.out.println("m1 Implemented method");
    }

    @Override
    public void m2() {
        System.out.println("InterfaceCheck m2 method");
    }
}
