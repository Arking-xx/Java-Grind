package com.fake;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void code() {
        System.out.println(getName() + " is coding in " + programmingLanguage);
    }

    public void work() {
        System.out.println(getName() + " is developing software in " + programmingLanguage);
    }
}
