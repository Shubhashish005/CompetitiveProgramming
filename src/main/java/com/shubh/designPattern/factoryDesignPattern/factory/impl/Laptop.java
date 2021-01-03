package com.shubh.designPattern.factoryDesignPattern.factory.impl;

import com.shubh.designPattern.factoryDesignPattern.factory.Computer;

public class Laptop implements Computer {

    private String ram;
    private String hdd;
    private String cpu;
    private Boolean isGraphicsEnabled;
    private Boolean isBluetoothEnabled;

    public Laptop(String ram, String hdd, String cpu, Boolean isGraphicsEnabled, Boolean isBluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.isGraphicsEnabled = isGraphicsEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public String ram() {
        return ram;
    }

    @Override
    public String hdd() {
        return hdd;
    }

    @Override
    public String cpu() {
        return cpu;
    }

    @Override
    public Boolean isgraphicsEnabled() {
        return isGraphicsEnabled;
    }

    @Override
    public Boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
