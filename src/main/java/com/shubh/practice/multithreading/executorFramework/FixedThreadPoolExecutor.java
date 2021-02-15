package com.shubh.practice.multithreading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            executorService.execute(() -> {
                System.out.println("Thread with task executing, i >> " + finalI + " with thread >> " + Thread.currentThread().getName());

                long seconds = (long) (Math.random() * 5);
                try {
                    TimeUnit.SECONDS.sleep(seconds);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
