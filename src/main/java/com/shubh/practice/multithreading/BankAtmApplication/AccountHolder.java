package com.shubh.practice.multithreading.BankAtmApplication;

public class AccountHolder implements Runnable {

    private Account account;
    private int amountToWithdraw;

    public AccountHolder(Account account, int amountToWithdraw) {
        this.account = account;
        this.amountToWithdraw = amountToWithdraw;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            withdraw(amountToWithdraw);
            if (account.getAvailableBalance() < 0){
                System.out.println("Amount is overwithdrawn");
            }
        }
    }

    private void withdraw(int amountToWithdraw) {
        if (account.getAvailableBalance() >= amountToWithdraw) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw amount of: " + amountToWithdraw);
            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
            account.withdrawAmount(amountToWithdraw);
            System.out.println("Amount of:" + amountToWithdraw + " withdrawn successfully, Available balance:" + account.getAvailableBalance() + ", Requested: " + Thread.currentThread().getName());

        } else
            System.out.println("Insufficient funds: " + amountToWithdraw + ",Requested:" + Thread.currentThread().getName());
    }
}
