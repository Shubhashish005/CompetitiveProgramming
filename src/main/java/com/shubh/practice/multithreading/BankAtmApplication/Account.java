package com.shubh.practice.multithreading.BankAtmApplication;

public class Account {
    private int availableBalance = 6000;

    public int getAvailableBalance() {
        return availableBalance;
    }

    public void withdrawAmount(int withdrawAmount) {
        availableBalance = availableBalance - withdrawAmount;
    }
}
