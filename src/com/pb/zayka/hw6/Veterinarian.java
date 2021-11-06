package com.pb.zayka.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.printf("%s %s %s %n", animal.getName(), animal.getFood(), animal.getLocation());
    }
}
