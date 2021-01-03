package com.shubh.designPattern.singleton_billPugh;

public class SingleTonBillPugh {

    public SingleTonBillPugh() {
    }

    public static SingleTonBillPugh getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static final class SingletonHolder {
        private static final SingleTonBillPugh INSTANCE = new SingleTonBillPugh();
    }
}
