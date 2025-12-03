package com.inventory;


public class Inventory {
    private String productName;
    private double price;
    private int quantity;

    public Inventory(String productName, double price,int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }



    @Override
    public String toString(){
        return "Saved in inventory" + "\n" + productName + "\n" + price + "\n" + quantity;
    }
}
