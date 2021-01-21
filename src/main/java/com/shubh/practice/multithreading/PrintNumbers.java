package com.shubh.practice.multithreading;

class Thread1 implements Runnable{

    @Override
    public void run() {
       for (int i=0; i<5; i++){
           System.out.println("Hi >> " + Thread.currentThread().getName());
       }
    }
}

class Thread2 extends Thread{

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("Hello >> " + Thread.currentThread().getName());
        }
    }
}

public class PrintNumbers {

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        Thread t1 = new Thread(thread1, "Thread-1");
        Thread t2 = new Thread(thread2, "Thread-2");

        t1.start();
        t2.start();
    }
}
