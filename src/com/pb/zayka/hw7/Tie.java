package com.pb.zayka.hw7;

public class Tie extends Clothes implements ManClothes {

    public Tie(Size size, int price, String color) {
        super("Галстук", size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(name + " " + size + " Цена " + price + " Цвет " + color);
    }
}
