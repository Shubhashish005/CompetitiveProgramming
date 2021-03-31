package com.shubh.designPattern.factoryDesignPattern.factory;

public class ClientTest {

    public static void main(String[] args) {

        Computer laptop = ComputerFactory.getInstance(ComputerType.LAPTOP, "8", "500", "16", true, true);
        System.out.println("Laptop config: " + laptop);

        Computer PC = ComputerFactory.getInstance(ComputerType.PC, "8", "500", "16", true, true);
        System.out.println("PC config: " + laptop);

        Computer Server = ComputerFactory.getInstance(ComputerType.SERVER, "8", "500", "16", true, true);
        System.out.println("Server config: " + laptop);

    }
}
