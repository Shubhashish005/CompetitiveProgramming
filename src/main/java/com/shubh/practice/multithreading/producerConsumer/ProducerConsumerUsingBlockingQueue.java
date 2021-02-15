package com.shubh.practice.multithreading.producerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

    private static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
    private static Random random = new Random();

    public static void main(String[] args) {

        Thread producerThread = new Thread(ProducerConsumerUsingBlockingQueue::producer);
        Thread consumerThread = new Thread(ProducerConsumerUsingBlockingQueue::consumer);

        producerThread.start();
        consumerThread.start();
    }

    private static void consumer() {
        while (true){
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            try {
                Integer consumedValue = blockingQueue.take();
                System.out.println("consumedValue > " + consumedValue);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }

    private static void producer() {
        while (true){
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            int producedValue = random.nextInt(100);
            try { blockingQueue.put(producedValue); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println("ProducedValue > " + producedValue);
        }
    }
}
