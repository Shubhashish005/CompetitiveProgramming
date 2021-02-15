package com.shubh.practice.multithreading.executorFramework;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SingleThreadTask implements Runnable {

    private int i;

    public SingleThreadTask(int i) {
        this.i = i;
    }

    @Override
    public void run() {

        System.out.println("Thread with task executing, i >> " + i + " with thread >> " + Thread.currentThread().getName());
        long duration = (long) (Math.random() * 5);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new SingleThreadTask(i));
        }
    }
}
