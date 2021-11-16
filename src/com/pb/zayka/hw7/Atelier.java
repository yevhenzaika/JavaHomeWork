package com.pb.zayka.hw7;

public class Atelier {
    public static void main(String[] args) {

        Pants pants = new Pants(Size.S,1550,"красный");
        Tshirt tshirt = new Tshirt(Size.L, 600, "белый");
        Skirt skirt = new Skirt(Size.XXS, 400, "желтый");
        Tie tie = new Tie(Size.L, 800, "черный");

        Clothes[] clothes = {pants, tshirt, skirt, tie};

        dressMan(clothes);
        System.out.println("------------------");
        dressWoman(clothes);
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
            }
        }
    }
    public static void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomanClothes) {
                ((WomanClothes) clothe).dressWoman();
            }
        }
    }
}
