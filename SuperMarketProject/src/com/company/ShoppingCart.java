package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class ShoppingCart {
   private ArrayList<Item> cart;
   int lastIndex = -1;
   private int MAXSIZE = 50;
   private double totalCost;


   private int appleCount;

    public ShoppingCart()
    {
       cart = new ArrayList <Item>();


    }

    public void AddItem(Item item)
    {
        cart.add(item);
        lastIndex++;
        if(Objects.equals(item.getName(), "apple"))
        {
            totalCost += 3;
            appleCount++;
        }
    }

    public void RemoveItem(Item item)
    {
        cart.remove(lastIndex);
        lastIndex--;

        if(item.getName() == "apple")
        {
            totalCost -= 3;
            appleCount--;
        }
    }

    @Override
    public String toString() {
        return "Apples: " + appleCount + "Total Cost: " + totalCost;
    }
}
