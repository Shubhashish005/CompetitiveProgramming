package com.shubh.practice.array;

class SuperClass {

    static {
        System.out.println("Static block");
    }

    public static void m1() {
        System.out.println("Super class static m1 method");
    }

    public void m2() {
        System.out.println("m2 Instance method");
    }
}

public class StaticTest {

    static SuperClass superClass;

    public static void main(String[] args) {

        superClass.m1();

    }

}
