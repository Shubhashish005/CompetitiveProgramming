package com.shubh.designPattern.builderDesignPattern;

public class Laptop {

    private String ram;
    private String hdd;
    private String cpu;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    private Laptop(LaptopBuilder laptopBuilder) {
        this.ram = laptopBuilder.ram;
        this.hdd = laptopBuilder.hdd;
        this.cpu = laptopBuilder.cpu;
        this.isGraphicsEnabled = laptopBuilder.isGraphicsEnabled;
        this.isBluetoothEnabled = laptopBuilder.isBluetoothEnabled;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public boolean getGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public boolean getBluetoothEnabled() {
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

    public static class LaptopBuilder {

        private String ram;
        private String hdd;
        private String cpu;

        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;

        public LaptopBuilder(String ram, String hdd, String cpu) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }

        public LaptopBuilder setGraphicsEnabled(boolean graphicsEnabled) {
            isGraphicsEnabled = graphicsEnabled;
            return this;
        }

        public LaptopBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}
