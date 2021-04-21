package com.shubh.practice.concurrent;

import java.util.concurrent.locks.ReentrantLock;

class Display {

    ReentrantLock reentrantLock = new ReentrantLock();

    public void wish(String name) {
        reentrantLock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " --- " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        reentrantLock.unlock();
    }
}

public class ReentrantLockExample {

    public static void main(String[] args) {
        Display display = new Display();

        new Thread(() -> display.wish("Shubhashish"), "Thread1").start();
        new Thread(() -> display.wish("Kumar"), "Thread2").start();
    }
}
