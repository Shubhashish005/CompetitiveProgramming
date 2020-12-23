package com.shubh.practice.multithreading.producerConsumer;

class Value {
    int num;
    boolean valueSet = false;
    public synchronized void get() {
        while (!valueSet){
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Get : " + num);
        valueSet = false;
        notify();
    }
    public synchronized void put(int num) {
        while (valueSet){
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Put : " + num);
        this.num = num;
        valueSet = true;
        notify();
    }
}

class Producer implements Runnable {
    Value value;
    public Producer(Value value){
        this.value = value;
        Thread thread1 = new Thread(this, "Producer");
        thread1.start();
    }
    @Override
    public void run() {
        int i=0;
        while (true){
            value.put(i++);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class Consumer implements Runnable {
    Value value;
    public Consumer(Value value){
        this.value = value;
        Thread thread2 = new Thread(this, "Consumer");
        thread2.start();
    }
    @Override
    public void run() {
        while (true){
            value.get();
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {
        Value value = new Value();
        Producer producer = new Producer(value);
        Consumer consumer = new Consumer(value);
    }
}
