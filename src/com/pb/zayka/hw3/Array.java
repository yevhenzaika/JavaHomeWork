package com.pb.zayka.hw3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            //int array[] = {4, -3, 5, 7, -1, -8, 12, 10, -6, 9};
            int[] array = new int[10];
            System.out.println("Введите одномерный массив целых чисел размерностью 10 элементов");
            for (int i = 0; i < array.length; i++)
                array[i] = in.nextInt();

/*
            for (int anArray : array)
                System.out.print(anArray + " ");
            System.out.println("\n");
*/
            System.out.println("Введенный массив");
            System.out.println(Arrays.toString(array));

            int sum = 0;
            for (int i : array)
                sum += i;
            System.out.println("Сумма всех элементов массива " + sum);

            int pos = 0;
            for (int i : array)
                if (i > 0)
                    pos++;
            System.out.println("Количество положительных элементов " + pos);

            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;
                        buf = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = buf;
                    }
                }
            }
            System.out.println("Отсортированный массив");
            System.out.println(Arrays.toString(array));
        } catch (InputMismatchException nfe) {
            System.out.println("Ошибка ввода");
        }


    }
}
