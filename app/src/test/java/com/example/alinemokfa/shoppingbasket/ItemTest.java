package com.example.alinemokfa.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alinemokfa on 03/12/2017.
 */

public class ItemTest {

    Item item1, item2;

    @Before
    public void before(){
        item1 = new Item("The Brothers Karamazov - Dostoyevsky, Fyodor", "book", 7.89, 1);
        item2 = new Item("Exploding Kittens: NSFW Edition", "game", 19.99, 1);
    }

    @Test
    public void canGetItemName(){
        assertEquals("The Brothers Karamazov - Dostoyevsky, Fyodor", item1.getName());
    }

    @Test
    public void canGetItemType(){
        assertEquals("book", item1.getType());
    }

    @Test
    public void canGetItemPrice(){
        assertEquals(19.99, item2.getPrice(), 0.01);
    }

    @Test
    public void canGetItemQuantity(){
        assertEquals(1, item2.getQuantity());
    }

}
