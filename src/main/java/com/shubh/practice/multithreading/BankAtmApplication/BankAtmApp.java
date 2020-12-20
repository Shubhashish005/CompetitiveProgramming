package com.shubh.practice.multithreading.BankAtmApplication;

public class BankAtmApp {

    public static void main(String[] args) {
        Account account = new Account();
        AccountHolder accountHolder = new AccountHolder(account, 2000);

        Thread thread1 = new Thread(accountHolder,"Husband");
        Thread thread2 = new Thread(accountHolder, "Wife");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final balance: " + account.getAvailableBalance());
    }
}
