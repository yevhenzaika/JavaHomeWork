package com.pb.zayka.hw6;

import java.util.Objects;

public class Cat extends Animal {

    private String gender;

    public Cat(String name, String food, String location) {
        super(name, food, location);
    }

    public Cat(String name, String food, String location, String gender) {
        super(name, food, location);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " мяукает");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(gender, cat.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", food=" + getFood() + '\'' +
                ", location=" + getLocation() + '\'' +
                ", gender=" + getGender() +
                '}';
    }
}
