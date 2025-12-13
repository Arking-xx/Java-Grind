package com.generics;

public class BoxWithGenerics<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void print(){
        System.out.println("Box contains: " + item);
    }
}
