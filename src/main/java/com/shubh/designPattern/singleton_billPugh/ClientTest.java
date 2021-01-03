package com.shubh.designPattern.singleton_billPugh;

public class ClientTest {

    public static void main(String[] args) {

        SingleTonBillPugh singleTonBillPugh = SingleTonBillPugh.getInstance();
        System.out.println(singleTonBillPugh.hashCode());
        System.out.println(singleTonBillPugh.hashCode());
        System.out.println(singleTonBillPugh.hashCode());
    }
}
