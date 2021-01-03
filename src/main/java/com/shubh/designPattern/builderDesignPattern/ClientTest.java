package com.shubh.designPattern.builderDesignPattern;

public class ClientTest {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop.LaptopBuilder("16", "240", "20").build();
        System.out.println("laptop1 config: " + laptop1);
    }
}
