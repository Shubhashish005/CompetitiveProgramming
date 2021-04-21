package com.shubh.practice.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PersonJob implements Runnable {
    String name;

    public PersonJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " Job started by thread -- " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " Job completed by thread -- " + Thread.currentThread().getName());
    }
}

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        PersonJob[] personJobs = {new PersonJob("Ramesh"),
                new PersonJob("Ravi"),
                new PersonJob("Akash"),
                new PersonJob("Imitiaz")
        };
        for (PersonJob personJob : personJobs) {
            executorService.execute(personJob);
        }

        executorService.shutdown();
    }
}
