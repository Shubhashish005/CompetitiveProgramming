package com.shubh.practice.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class ProducerThread implements Runnable {

    private Queue<Integer> sharedQueue;

    public ProducerThread(Queue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedQueue) {
                while (sharedQueue.size() == 5) {
                    try {
                        System.out.println("Producer is waiting for Consumer to consumer Objects");
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Random random = new Random();
                int producedValue = random.nextInt(5);
                sharedQueue.add(producedValue);
                System.out.println("Produced Value > " + producedValue);
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                sharedQueue.notify();
            }
        }
    }
}

class ConsumerThread implements Runnable {

    private Queue<Integer> sharedQueue;

    public ConsumerThread(Queue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedQueue) {
                while (sharedQueue.isEmpty()) {
                    try {
                        System.out.println("Consumer is waiting for Producer to Produce Objects");
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer consumedValue = sharedQueue.poll();
                System.out.println("consumedValue > " + consumedValue);
                sharedQueue.notify();
            }
        }
    }
}

public class ProducerConsumerUsingTraditionalApproach {
    public static void main(String[] args) {
        Queue<Integer> sharedQueue = new LinkedList<>();
        Thread producerThread = new Thread(new ProducerThread(sharedQueue), "ProducerThread");
        Thread consumerThread = new Thread(new ConsumerThread(sharedQueue), "ConsumerThread");
        producerThread.start();
        consumerThread.start();
    }
}
