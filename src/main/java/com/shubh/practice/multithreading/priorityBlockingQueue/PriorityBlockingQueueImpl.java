package com.shubh.practice.multithreading.priorityBlockingQueue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

class Person {
    int age;
    String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class PriorityBlockingQueueImpl {

    public static void main(String[] args) {

        BlockingQueue<Person> sharedQueue = new PriorityBlockingQueue<>(5, Comparator.comparing(Person::getAge));
        Thread createrThread = new Thread(() -> {
            try {
                sharedQueue.put(new Person(22, "Raj"));
                sharedQueue.put(new Person(12, "Akash"));
                Thread.sleep(1000);
                sharedQueue.put(new Person(34, "Daniel"));
                sharedQueue.put(new Person(25, "Zoya"));
                Thread.sleep(1000);
                sharedQueue.put(new Person(47, "Nishan"));

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        Thread retrieverThread = new Thread(() -> {
            try {
                sharedQueue.take();
                sharedQueue.take();
                Thread.sleep(1000);
                sharedQueue.take();
                sharedQueue.take();
                Thread.sleep(1000);
                sharedQueue.take();

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        createrThread.start();
        retrieverThread.start();
    }
}
