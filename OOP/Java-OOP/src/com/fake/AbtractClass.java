package com.fake;

// abstract can't use new keyword
abstract class Vehicle {
    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    abstract void start();

    abstract void stop();

    public void honk() {
        System.out.println("Beep Beep");
    }

    public String getName() {
        return name;
    }
}


// concrete implementation for vehicle
// when using the extends for concrete u manually implement
// what to return
public class AbtractClass extends Vehicle {

    public AbtractClass(String name) {
        super(name); // calls parent contructor
    }

    public void start() {
        System.out.println("Car " + name + " turn key, engine roars");
    }

    public void stop() {
        System.out.println("Car " + name + "  press brake, engine off");
    }

}
