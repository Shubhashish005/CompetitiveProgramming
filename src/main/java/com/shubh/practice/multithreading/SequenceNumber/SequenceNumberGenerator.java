package com.shubh.practice.multithreading.SequenceNumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SequentialNumberGenerator {

    private int number = 1;
    private int numberOfThreads;
    private int sequenceTill;

    public SequentialNumberGenerator(int numberOfThreads, int sequenceTill) {
        this.numberOfThreads = numberOfThreads;
        this.sequenceTill = sequenceTill;
    }

    public void generateSequence(int result) {
        synchronized (this) {
            while (number < sequenceTill - 1) {
                while (number % numberOfThreads != result) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": " + number++);
                notifyAll();
            }
        }
    }
}

public class SequenceNumberGenerator {

    public static void main(String[] args) {
        SequentialNumberGenerator numberGenerator = new SequentialNumberGenerator(3, 20);
      /*  Thread thread1 = new Thread(() -> numberGenerator.generateSequence(1), "Thread-1");
        Thread thread2 = new Thread(() -> numberGenerator.generateSequence(2), "Thread-2");
        Thread thread3 = new Thread(() -> numberGenerator.generateSequence(0), "Thread-3");
        thread1.start();
        thread2.start();
        thread3.start();*/


        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(3);
            executorService.submit(() -> numberGenerator.generateSequence(1), "Thread-1");
            executorService.submit(() -> numberGenerator.generateSequence(2), "Thread-2");
            executorService.submit(() -> numberGenerator.generateSequence(0), "Thread-3");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != executorService){
                executorService.shutdown();
            }
        }


    }
}
