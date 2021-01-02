package com.shubh.designPattern.singleton_threadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

    public static void main(String[] args) {

        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(5);
            executorService.submit(() -> {
                SingleTonThreadSafe instance = SingleTonThreadSafe.getInstance();
                System.out.println(Thread.currentThread().getName() + " " + instance.hashCode());
            });

            executorService.submit(() -> {
                SingleTonThreadSafe instance = SingleTonThreadSafe.getInstance();
                System.out.println(Thread.currentThread().getName() + " " + instance.hashCode());
            });

            executorService.submit(() -> {
                SingleTonThreadSafe instance = SingleTonThreadSafe.getInstance();
                System.out.println(Thread.currentThread().getName() + " " + instance.hashCode());
            });
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }
}
