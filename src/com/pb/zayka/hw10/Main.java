package com.pb.zayka.hw10;

public class Main {
    public static void main(String[] args) throws Exception {

        NumBox<Integer> objInt = new NumBox<Integer>(4);
        try {
            objInt.add(1);
            objInt.add(2);
            objInt.add(3);
            objInt.add(4);
//            objInt.add(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------Integer-----------");
        System.out.println("число по индексу " + objInt.get(1));
        System.out.println("количество элементов " + objInt.length());
        System.out.println("сумма всех элементов " + objInt.sum());
        System.out.println("среднее арифметическое " + objInt.average());
        System.out.println("максимальный элемент " + objInt.max());


        NumBox<Float> objFloat = new NumBox<Float>(3);
        try {
            objFloat.add(1.1f);
            objFloat.add(2.2f);
            objFloat.add(3.3f);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------Float-----------");
        System.out.println("число по индексу " + objFloat.get(1));
        System.out.println("количество элементов " + objFloat.length());
        System.out.println("сумма всех элементов " + objFloat.sum());
        System.out.println("среднее арифметическое " + objFloat.average());
        System.out.println("максимальный элемент " + objFloat.max());

    }
}