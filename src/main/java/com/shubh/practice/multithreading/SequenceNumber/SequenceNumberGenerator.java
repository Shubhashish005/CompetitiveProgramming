package com.shubh.practice.multithreading.SequenceNumber;

class NumberGenerator {

    private int number = 1;
    private int numberOfThreads;
    private int sequenceTill;

    public NumberGenerator(int numberOfThreads, int sequenceTill) {
        this.numberOfThreads = numberOfThreads;
        this.sequenceTill = sequenceTill;
    }

    public void generateSequence(int result) {
        synchronized (this){
            while (number < sequenceTill-1){
                while (number % numberOfThreads != result){
                    try { wait();} catch (InterruptedException e) { e.printStackTrace(); }
                }

                try { Thread.sleep(1000);} catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println(Thread.currentThread().getName() + ": " + number++);
                notifyAll();
            }
        }

    }
}

class SequenceGeneratorTask implements Runnable {

    private NumberGenerator numberGenerator;
    private int value;

    public SequenceGeneratorTask(NumberGenerator numberGenerator, int value) {
        this.numberGenerator = numberGenerator;
        this.value = value;
    }

    @Override
    public void run() {
        numberGenerator.generateSequence(value);
    }
}

public class SequenceNumberGenerator {

    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator(3, 20);
        Thread thread1 = new Thread(new SequenceGeneratorTask(numberGenerator, 1), "Thread-1");
        Thread thread2 = new Thread(new SequenceGeneratorTask(numberGenerator, 2), "Thread-2");
        Thread thread3 = new Thread(new SequenceGeneratorTask(numberGenerator, 0), "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
