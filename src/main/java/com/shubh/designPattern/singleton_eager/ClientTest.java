package com.shubh.designPattern.singleton_eager;

public class ClientTest {

    public static void main(String[] args) {

        SingleTonUsingEager singleTonUsingEager1 = SingleTonUsingEager.getInstance();
        SingleTonUsingEager singleTonUsingEager2 = SingleTonUsingEager.getInstance();

        System.out.println(singleTonUsingEager1.hashCode());
        System.out.println(singleTonUsingEager2.hashCode());

    }
}
