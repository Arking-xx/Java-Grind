package com.fake;


public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void conductingMeeting() {
        System.out.println(getName() + " is conducting a meeting in " + department);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the " + department + " department");
    }
}

