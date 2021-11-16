package com.pb.zayka.hw7;

public abstract class Clothes {

    protected String name;
    protected Size size;
    protected int price;
    protected String color;

    public Clothes(String name, Size size, int price, String color) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
