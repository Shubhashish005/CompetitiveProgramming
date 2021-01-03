package com.shubh.designPattern.singletonDesignPattern.singleton_lazy;

public class SingleTonUsingLazy {

    private static SingleTonUsingLazy INSTANCE = null;

    private SingleTonUsingLazy() {
    }

    public static SingleTonUsingLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleTonUsingLazy();
        }
        return INSTANCE;
    }
}
