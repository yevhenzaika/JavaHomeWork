package com.pb.zayka.hw7;

public class Skirt extends Clothes implements WomanClothes {

    public Skirt(Size size, int price, String color) {
        super("Юбка", size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println(name + " " + size + " Цена " + price + " Цвет " + color);
    }
}
