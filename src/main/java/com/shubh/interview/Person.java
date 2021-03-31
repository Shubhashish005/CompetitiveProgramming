package com.shubh.interview;

import java.util.concurrent.atomic.AtomicInteger;

public class Person {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void generateNumber() {
        atomicInteger.incrementAndGet();
    }

    private static void printResult() {
        System.out.println(atomicInteger);
    }


    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + "---" + Thread.currentThread().getName());
            }
        }, "Thread1");

        Thread t2 = new Thread(() -> {
            try {
                t1.join();
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i + "---" + Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread2");

/*        Thread t3 = new Thread(() -> {
            for (int i=1; i<=5; i++){
                System.out.println(i + "---" + Thread.currentThread().getName());
            }
        }, "Thread3");*/


        t1.start();
        t2.start();
        //t3.start();

    }
}
