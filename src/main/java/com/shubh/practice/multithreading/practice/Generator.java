package com.shubh.practice.multithreading.practice;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {

    AtomicInteger x = new AtomicInteger(0);

    public void increment() {
        //x++
        x.getAndIncrement();
    }
}

public class Generator {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Value >> " + counter.x);
    }

}
