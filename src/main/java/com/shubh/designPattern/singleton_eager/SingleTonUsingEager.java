package com.shubh.designPattern.singleton_eager;

public class SingleTonUsingEager {

    private final static SingleTonUsingEager INSTANCE = new SingleTonUsingEager();

    private SingleTonUsingEager() {
    }

    public static SingleTonUsingEager getInstance() {
        return INSTANCE;
    }
}
