package com.shubh.designPattern.singleton_cloning;

public class ClientTest {

    public static void main(String[] args) {

        SingleTonClone singleTonClone1 = new SingleTonClone();
        try {
            SingleTonClone singleTonClone2 = (SingleTonClone) singleTonClone1.clone();
            System.out.println(singleTonClone1.hashCode());
            System.out.println(singleTonClone2.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
