package com.shubh.designPattern.factoryDesignPattern.factory;

import com.shubh.designPattern.factoryDesignPattern.factory.impl.Laptop;
import com.shubh.designPattern.factoryDesignPattern.factory.impl.PC;
import com.shubh.designPattern.factoryDesignPattern.factory.impl.Server;

public class ComputerFactory {

    private ComputerFactory() {
    }

    public static Computer getInstance(ComputerType computerType, String ram, String hdd, String cpu, Boolean isGraphicsEnabled, Boolean isBluetoothEnabled) {

        switch (computerType) {
            case PC:
                return new PC(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
            case LAPTOP:
                return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
            case SERVER:
                return new Server(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
            default:
                throw new RuntimeException("Invalid Computer Type");
        }
    }
}
