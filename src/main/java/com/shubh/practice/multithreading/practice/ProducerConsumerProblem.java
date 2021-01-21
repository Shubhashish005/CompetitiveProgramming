package com.shubh.practice.multithreading.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class ProducerThread implements Runnable {

    Queue<Integer> sharedQueue;

    public ProducerThread(Queue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (sharedQueue) {
                while (sharedQueue.size() > 5) {
                    try {
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Random random = new Random();
                int producedValue = random.nextInt(10);
                System.out.println("Produced Value >> " + producedValue);
                sharedQueue.add(producedValue);
                sharedQueue.notify();
            }
        }
    }
}

class ConsumerThread implements Runnable {

    Queue<Integer> sharedQueue;

    public ConsumerThread(Queue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedQueue) {
                while (sharedQueue.isEmpty()) {
                    try {
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Integer consumedValue = sharedQueue.poll();
                System.out.println("Consumed Value >> " + consumedValue);
                sharedQueue.notify();
            }
        }
    }
}

public class ProducerConsumerProblem {

    public static void main(String[] args) {

        Queue<Integer> sharedQueue = new LinkedList<>();

        Thread producerThread = new Thread(new ProducerThread(sharedQueue), "ProducerThread");
        Thread consumerThread = new Thread(new ConsumerThread(sharedQueue), "ConsumerThread");

        producerThread.start();
        consumerThread.start();
    }
}
