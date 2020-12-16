package com.shubh.practice.multithreading;

class Thread1 implements Runnable{

    @Override
    public void run() {
       for (int i=0; i<5; i++){
           System.out.println("Hi");
       }
    }
}

class Thread2 extends Thread{

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("Hello");
        }
    }
}

public class PrintNumbers {

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();

    }
}
