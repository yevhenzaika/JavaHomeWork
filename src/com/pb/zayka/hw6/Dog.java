package com.pb.zayka.hw6;

import java.util.Objects;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, String food, String location, String breed) {
        super(name, food, location);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " лает");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", food=" + getFood() + '\'' +
                ", location=" + getLocation() + '\'' +
                ", breed=" + getBreed() +
                '}';
    }
}
