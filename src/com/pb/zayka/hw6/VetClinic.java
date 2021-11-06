package com.pb.zayka.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Шарик", "Мясо", "Будка", "дворняга");
        animals[1] = new Cat("Мурчик", "Молоко", "Дом", "мальчик");
        animals[2] = new Horse("Буцефал", "Сено", "Стойло","рыжий");

        Animal[] animals2 = new Animal[3];
        animals2[0] = new Dog("Барбос", "Каша", "Будка", "дворняга");
        animals2[1] = new Cat("Пират", "Рыба", "Гараж", "девочка");
        animals2[2] = new Horse("Атило", "Сено", "Стойло","рыжий");


        Class clazz = Class.forName("com.pb.zayka.hw6.Veterinarian");

        Constructor constr = clazz.getConstructor(new Class[] {});
        Object obj = constr.newInstance();

        if (obj instanceof Veterinarian) {
            for (Animal animal: animals)
                ((Veterinarian) obj).treatAnimal(animal);
            System.out.println("------------------------");
            for (Animal animal: animals2)
                ((Veterinarian) obj).treatAnimal(animal);
        }

//        animals[0].makeNoise();
//        animals[1].makeNoise();
//        animals[2].makeNoise();
//        animals[0].eat();
//        animals[1].eat();
//        animals[2].eat();
//        animals[0].sleep();
//        animals[1].sleep();
//        animals[2].sleep();


//        System.out.println("------------------------");
//        System.out.println(animals[0]);
//        System.out.println(animals2[0]);
//        System.out.println(animals[1]);
//        System.out.println(animals2[1]);
//        System.out.println(animals[2]);
//        System.out.println(animals2[2]);
//        System.out.println("------------------------");
//
//        System.out.println("------------------------");
//        System.out.println("Сравнение собак по породе: " + animals[0].equals(animals2[0]));
//        System.out.println("hash dog1 " + animals[0].hashCode());
//        System.out.println("hash dog2 " + animals2[0].hashCode());
//        System.out.println("Сравнение кошек по гендеру: " + animals[1].equals(animals2[1]));
//        System.out.println("hash cat1 " + animals[1].hashCode());
//        System.out.println("hash cat2 " + animals2[1].hashCode());
//        System.out.println("Сравнение коней по окрасу: " + animals[2].equals(animals2[2]));
//        System.out.println("hash horse1 " + animals[2].hashCode());
//        System.out.println("hash horse2 " + animals2[2].hashCode());
//        System.out.println("------------------------");

//        Veterinarian vet = new Veterinarian();
//        System.out.println(vet);
//        vet.treatAnimal(animals[0]);
//        System.out.println("------------------------");

//        Veterinarian vet = new Veterinarian();
//        Class clazz = vet.getClass();
//        System.out.println(clazz.getName());


    }
}
