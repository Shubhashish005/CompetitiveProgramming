package com.shubh.designPattern.singleton_break_reflection;

import java.lang.reflect.Constructor;

public class ClientTest {

    public static void main(String[] args) throws Exception {

        SingleTonBreak singleTonBreak1 = SingleTonBreak.getInstance();
        SingleTonBreak singleTonBreak2 = null;

        Constructor<?>[] declaredConstructors = SingleTonBreak.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);

            Object object = constructor.newInstance();
            singleTonBreak2 = (SingleTonBreak) object;

            break;
        }

        System.out.println(singleTonBreak1.hashCode());
        System.out.println(singleTonBreak2.hashCode());
    }
}
