package com.shubh.designPattern.factoryDesignPattern.factory;

public class ClientTest {

    public static void main(String[] args) {

        Computer laptop = ComputerFactory.getInstance(COmputerType.LAPTOP, "8", "500", "16", true, true);
        System.out.println("Laptop config: " + laptop);

        Computer PC = ComputerFactory.getInstance(COmputerType.PC, "8", "500", "16", true, true);
        System.out.println("PC config: " + laptop);

        Computer Server = ComputerFactory.getInstance(COmputerType.SERVER, "8", "500", "16", true, true);
        System.out.println("Server config: " + laptop);

    }
}
