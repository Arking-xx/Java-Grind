package com.fake;

// public - "access modifiers same with private"
public class Car {
    //    fields - put some private so that it access within this Car class
    private String type;
    private String model;
    private String color;
    private int speed;

    //    constructors - if not initialize with constructors type, model, and color is null
    //    for speed its okayish since the value is 0
    //    constructor also force user to input all the required fields
    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    // methods
    public int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }

    public int getSpeed() {
        return speed;
    }
}
