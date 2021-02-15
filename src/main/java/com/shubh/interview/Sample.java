package com.shubh.interview;

class SuperSample {

    static {
        System.out.println("Static block of SuperSample");
    }

    {
        System.out.println("Instance block of SuperSample");
    }

    SuperSample() {
        System.out.println("Default Constructor of SuperSample");
    }

    SuperSample(int a) {
        System.out.println("Parameterized Constructor of SuperSample");
    }
}

public class Sample extends SuperSample {

    static {
        System.out.println("Static block of Sample");
    }

    {
        System.out.println("Instance block of Sample");
    }

    Sample(int a) {
        System.out.println("Parameterized Constructor of Sample");
    }

    public static void main(String[] args) {
        SuperSample s = new Sample(10);

    }
}
