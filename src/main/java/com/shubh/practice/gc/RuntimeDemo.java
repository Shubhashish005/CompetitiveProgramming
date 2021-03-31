package com.shubh.practice.gc;

import java.util.Date;

public class RuntimeDemo {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.out.println("AvailableProcessor - " + runtime.availableProcessors());
        System.out.println("TotalMemory - " + runtime.totalMemory());
        System.out.println("FreeMemory - " + runtime.freeMemory());
        System.out.println("MaxMemory - " + runtime.maxMemory());

        for (int i = 0; i < 10000; i++) {
            Date d = new Date();
            d = null;
        }

        System.out.println("-----After creating object----");
        System.out.println("AvailableProcessor - " + runtime.availableProcessors());
        System.out.println("TotalMemory - " + runtime.totalMemory());
        System.out.println("FreeMemory - " + runtime.freeMemory());
        System.out.println("MaxMemory - " + runtime.maxMemory());

        runtime.gc();

        System.out.println("-----After running GC----");
        System.out.println("AvailableProcessor - " + runtime.availableProcessors());
        System.out.println("TotalMemory - " + runtime.totalMemory());
        System.out.println("FreeMemory - " + runtime.freeMemory());
        System.out.println("MaxMemory - " + runtime.maxMemory());
    }
}
