package com.example.alinemokfa.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by alinemokfa on 03/12/2017.
 */

public class ShoppingBasket {

    private ArrayList<Item> basket;

    public ShoppingBasket() {
        this.basket = new ArrayList<>();
    }

    public ArrayList<Item> getBasket() {
        return this.basket;
    }

    public void addItem(Item item) {
        this.basket.add(item);
    }
}
