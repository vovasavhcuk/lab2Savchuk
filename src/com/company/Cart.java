package com.company;

import java.util.ArrayList;

public class Cart {
     ArrayList<Item> items = new ArrayList<>();
     private int maxLength;
    public Cart(int maxLength) {
        this.maxLength = setMaxLength(maxLength);
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int setMaxLength(int maxLength) {
        if(maxLength<0){
            maxLength = 0;
        }
        this.maxLength = maxLength;
        return maxLength;
    }
    public boolean add(Item item) {
        if (items.size() < maxLength) {
            return items.add(item);
        }
        return false;
    }
    public float getSumPrice(){
        float sum = 0;
        for (Item item:items) {
            sum += item.getPrice();
        }
        return sum;
    }
    public void raisePrices(float percent){
        float tempPrice;
        for (Item item:items) {
            tempPrice = item.getPrice();
            tempPrice = tempPrice + tempPrice*(percent/100);
            item.setPrice(tempPrice);
        }
    }
    public void reducePrices(float percent){
        float tempPrice;
        for (Item item:items) {
            tempPrice = item.getPrice();
            tempPrice = tempPrice - tempPrice*(percent/100);
            item.setPrice(tempPrice);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " items=" + items;
    }
}
