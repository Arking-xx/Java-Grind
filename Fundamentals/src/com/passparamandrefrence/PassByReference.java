package com.passparamandrefrence;

class Person {
    String name;
    Person(String name ){
        this.name = name;
    }
}

public class PassByReference {
    public static void objectPassingDemo(String name) {

        Person myPerson = new Person(name);
        System.out.println("Before method call" + myPerson.name);

        tryToChangeReference(myPerson);
        System.out.println("after tryToChangeReference" + myPerson.name);

        tryToChangeObject(myPerson);
        System.out.println("after tryToChangeObject" + myPerson.name);
    }
public static void tryToChangeReference(Person personCopy) {
        personCopy = new Person("Charlie");
        System.out.println("Inside tryToChangeReference"+   personCopy.name);
}
public static void tryToChangeObject(Person personCopy){
        personCopy.name = "Bob";
        System.out.println("Inside tryToChangeObject" + personCopy.name);
}

}
