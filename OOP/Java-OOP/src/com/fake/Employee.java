package com.fake;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

