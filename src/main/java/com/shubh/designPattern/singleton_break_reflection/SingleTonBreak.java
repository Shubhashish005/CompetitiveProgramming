package com.shubh.designPattern.singleton_break_reflection;

public class SingleTonBreak {

    private static SingleTonBreak INSTANCE;

    private SingleTonBreak() {
    }

    public static SingleTonBreak getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleTonBreak();
        }
        return INSTANCE;
    }
}
