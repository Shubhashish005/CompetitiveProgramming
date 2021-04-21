package com.shubh.practice.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DisplayUsingTryLock {

    Lock lock = new ReentrantLock();

    public void wish(String name) {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " - Got the lock - " + name);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Does not Got the lock - " + name);
        }
    }
}

public class ReentractLockUsingTRyLock {

    public static void main(String[] args) {

        DisplayUsingTryLock displayUsingTryLock = new DisplayUsingTryLock();

        new Thread(() -> displayUsingTryLock.wish("Shubhashish"), "Thread1").start();
        new Thread(() -> displayUsingTryLock.wish("Kumar"), "Thread2").start();
    }
}
