package com.shubh.practice.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapExample {

    static Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {

        orders.put("Punjab", 0);
        orders.put("Bihar", 0);
        orders.put("Delhi", 0);
        orders.put("Bangalore", 0);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(ConcurrentHashMapExample::processOders);
        executorService.submit(ConcurrentHashMapExample::processOders);

        try {
            executorService.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

        System.out.println(orders);
    }

    static void processOders() {
        for (String city : orders.keySet()) {
            for (int i = 0; i < 50; i++) {
                int integer = orders.get(city);
                orders.put(city, integer + 1);
            }
        }
    }
}
