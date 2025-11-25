package com.tesla;

abstract class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public abstract void move();

    public void displayInfo(){
        System.out.println(brand + "(" + year + ")");
    }
}

interface Electric {
    int BATTERY_CAPACITY = 100;
    void charge();
    int getBatteryLevel();
}

interface GPSenable{
    String DEFAULT_MAP = "Google Map";
    void navigate(String destination);
}