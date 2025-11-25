package com.fake;

public interface Electronic {
    // constant
    String LED = "LED";

    // abstract method
    int getElectricity();

    static boolean isEnergy(String electronType){
        if(electronType.equals(LED)){
            return true;
        }
        return false;
    }

    default void printDescription() {
        System.out.println("Electronic Description");
    }
}
