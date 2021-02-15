package com.shubh.practice.multithreading.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerUsingConditionLock {

    static Lock lock = new ReentrantLock();
    static Condition added = lock.newCondition();
    static Condition removed = lock.newCondition();
    static Queue<Integer> sharedQueue = new LinkedList<>();

    public static void main(String[] args) {

        Thread thread1 = new Thread(ProducerConsumerUsingConditionLock::produce, "ProducerThread");
        Thread thread2 = new Thread(ProducerConsumerUsingConditionLock::consume, "ConsumerThread");
        thread1.start();
        thread2.start();
    }

    private static void produce() {
        lock.lock();
        try {
            while (sharedQueue.size() > 5) {
                try {
                    removed.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Random random = new Random();
            int producedValue = random.nextInt(10);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sharedQueue.add(producedValue);
            System.out.println(Thread.currentThread().getName() + ": Produced Value >>" + producedValue);
            added.signal();
        } finally {
            lock.unlock();
        }
    }

    private static void consume() {
        lock.lock();
        try {
            while (sharedQueue.isEmpty()) {
                try {
                    added.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Integer consumedValue = sharedQueue.poll();
            System.out.println(Thread.currentThread().getName() + ": Consumed Value >>" + consumedValue);
            removed.signal();
        } finally {
            lock.unlock();
        }
    }
}
