package com.shubh.practice.multithreading.producerConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerUsingConditionLock {

    static Lock lock = new ReentrantLock();
    static Condition added = lock.newCondition();
    static Condition removed = lock.newCondition();

    public static void main(String[] args) {
/*
        Thread thread1 = new Thread(() -> produce());
        Thread thread2 = new Thread(() -> produce());*/
    }

}
