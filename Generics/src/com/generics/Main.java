package com.generics;


public class Main {
    public static void main(String[] args) {

        // class without generic
        BoxWithoutGenerics oldBox = new BoxWithoutGenerics();
        oldBox.setItem("hello");
        // need to cast, error prone
        String text =(String) oldBox.getItem();
        System.out.println(text);


        // class with generic
        BoxWithGenerics<String> box = new BoxWithGenerics();
        box.setItem("box with generics");
        box.print();

        BoxWithGenerics<Integer> intBox = new BoxWithGenerics();
        intBox.setItem(123);
        intBox.print();


        // pair Generics V, K

        Pair<String, Integer> agePair = new Pair<>("Alice", 30);
        System.out.println(agePair.toString());

        Pair<String, Double> pricePair = new Pair<>("Apple", 50.00);
        System.out.println(pricePair.toString());
        }
    }