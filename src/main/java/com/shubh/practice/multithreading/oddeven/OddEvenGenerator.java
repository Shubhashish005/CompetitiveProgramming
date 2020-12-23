package com.shubh.practice.multithreading.oddeven;

class OddEvenNumberGenerator {

    private int number = 1;
    private int sequenceTill;
    private int numberOfThreads;

    OddEvenNumberGenerator(int sequenceTill, int numberOfThreads) {
        this.sequenceTill = sequenceTill;
        this.numberOfThreads = numberOfThreads;
    }
    void generateOddEven(int result) {
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

                System.out.println(Thread.currentThread().getName() + ":" + number++);
                notifyAll();
            }
        }
    }
}

public class OddEvenGenerator {
    public static void main(String[] args) {
        OddEvenNumberGenerator oddEvenGenerator = new OddEvenNumberGenerator(20, 2);
        Thread oddThread = new Thread(() -> oddEvenGenerator.generateOddEven(1), "OddThread");
        Thread evenThread = new Thread(() -> oddEvenGenerator.generateOddEven(0), "EvenThread");
        oddThread.start();
        evenThread.start();
    }
}
