package com.example.alinemokfa.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alinemokfa on 03/12/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket basket;
    Item item1;
    Item item2;

    @Before
    public void before() {
        basket = new ShoppingBasket();
        item1 = new Item("The Brothers Karamazov - Dostoyevsky, Fyodor", "book", 7.89, 1);
        item2 = new Item("Exploding Kittens: NSFW Edition", "game", 19.99, 1);
    }

    @Test
    public void basketStartsEmpty() {
        assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void canAddItemToBasket() {
        basket.addItem(item1);
        assertEquals(1, basket.getBasket().size());
    }

    @Test
    public void canRemoveItemFromBasket() {
        basket.addItem(item2);
        basket.removeItem(item2);
        assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void canEmptyBasket(){
        basket.addItem(item1);
        basket.emptyBasket();
        assertEquals(0, basket.getBasket().size());
    }

}
