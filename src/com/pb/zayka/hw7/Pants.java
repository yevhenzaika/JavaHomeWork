package com.pb.zayka.hw7;

public class Pants extends Clothes implements ManClothes, WomanClothes {

    public Pants(Size size, int price, String color) {
        super("Штаны", size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(name + " " + size + " Цена " + price + " Цвет " + color);
    }

    @Override
    public void dressWoman() {
        System.out.println(name + " " + size + " Цена " + price + " Цвет " + color);
    }
}
