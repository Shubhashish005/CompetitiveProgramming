package com.shubh.designPattern.singletonDesignPattern.singleton_static;

public class SingleTonUsingStaticInitialization {

    private static SingleTonUsingStaticInitialization INSTANCE = null;

    static {
        try {
            INSTANCE = new SingleTonUsingStaticInitialization();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private SingleTonUsingStaticInitialization() {
    }

    public static SingleTonUsingStaticInitialization getInstance() {
        return INSTANCE;
    }
}
