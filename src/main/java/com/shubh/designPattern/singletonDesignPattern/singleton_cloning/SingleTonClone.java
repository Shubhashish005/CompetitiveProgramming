package com.shubh.designPattern.singletonDesignPattern.singleton_cloning;

public class SingleTonClone implements Cloneable {

    private static SingleTonClone INSTANCE;

    public SingleTonClone() {
    }

    public static SingleTonClone getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new SingleTonClone();
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
