package com.tesla;

public class Tesla extends Vehicle implements Electric, GPSenable {
    private int batteryLevel;

    public Tesla(String brand, int year) {
        super(brand, year);
        this.batteryLevel = 80;
    }

    @Override
    public void move() {
        System.out.println("Tesla moving silently");
    }

    @Override
    public void charge() {
        batteryLevel = 100;
        System.out.println("Fully charged");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void navigate(String navigation) {
        System.out.println("Navigating to " + navigation + " using " + GPSenable.DEFAULT_MAP);
    }
}
