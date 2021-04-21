package com.shubh.practice.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer> {
    private int num;

    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

public class CallableExample {

    public static void main(String[] args) {
        MyCallable[] myCallables = {new MyCallable(30), new MyCallable(40), new MyCallable(80), new MyCallable(60)};
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (MyCallable myCallable : myCallables) {
            Future<Integer> future = executorService.submit(myCallable);
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
