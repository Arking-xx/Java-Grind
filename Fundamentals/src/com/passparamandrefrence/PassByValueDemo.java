package com.passparamandrefrence;

public class PassByValueDemo {
        public static void passValue(int originalNumber) {
            System.out.println("Before method call"+ originalNumber);


            tryToChange(originalNumber);

            System.out.println("After method call" + originalNumber);
        }
        public static void tryToChange(int numberCopy) {
            numberCopy = 20;
            System.out.println("inside method" + numberCopy);
        }
    }
