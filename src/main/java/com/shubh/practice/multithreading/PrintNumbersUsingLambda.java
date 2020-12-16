package com.shubh.practice.multithreading;

public class PrintNumbersUsingLambda {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> System.out.println("ffd"));
        thread2.start();

        Thread thread3 = new Thread(() -> {
            for (int i=0; i<5; i++){
                System.out.println("Hi");
            }
        });

        thread3.start();

    }
}
