package com.company;

public class Item {
    private String name;
    private float price;

    public Item(String name, float price) {
        this.name = setName(name);
        this.price = setPrice(price);
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public float getPrice() {
        return price;
    }

    public float setPrice(float price) {
        if(price<0) {
            price = 0;
        }
        this.price = price;
        return this.price;
    }

    public void raisePrice(float percent) {
        this.price = price + price*(percent/100);

    }
    public void reducePrice(float percent){
        this.price = price - price*(percent/100);
    }

    @Override
    public String toString() {
        return "\nItem " +
                "name = " + getName() +
                ", price = " + getPrice();
    }
}
