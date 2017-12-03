package com.example.alinemokfa.shoppingbasket;

/**
 * Created by alinemokfa on 03/12/2017.
 */

public class Item {

    private String name;
    private String type;
    private double price;
    private int quantity;

    public Item(String name, String type, double price, int quantity) {

        this.name =  name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
