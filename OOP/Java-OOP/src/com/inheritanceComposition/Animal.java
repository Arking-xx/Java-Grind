package com.inheritanceComposition;


// IS-A relation
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}


// Cat IS-A animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

// Has-A relationship
class Processor {
    void process() {
        System.out.println("processing data...");
    }
}

class Memory {
    void store() {
        System.out.println("storing data...");
    }
}

// Computer HAS-A
// Processor, Memory
class Computer {
    private Processor processor;
    private Memory memory;

    public Computer() {
        this.processor = new Processor();
        this.memory = new Memory();
    }
}
