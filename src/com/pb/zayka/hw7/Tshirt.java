package com.pb.zayka.hw7;

public class Tshirt extends Clothes implements ManClothes, WomanClothes {

    public Tshirt(Size size, int price, String color) {
        super("Футболка", size, price, color);
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
