package com.pb.zayka.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int bingo = random.nextInt(101);
        int count = 0;
        String str;

        System.out.println("bingo: " + bingo);
        System.out.println("Отгадайте целое число в диапазоне от 0 до 100.");
        System.out.println("Для выхода из программы введите - exit.");
        System.out.println("Введите целое число: ");

        for (; ; ) {
            count++;
            str = in.next();

            if (str.equals("exit")) {
                break;
            }
            try {
                int value = Integer.parseInt(str.trim());
                if (value == bingo) {
                    System.out.println("Вы угадали с " + count + " попытки");
                    break;
                } else {
                    if (value > bingo)
                        System.out.println("Меньше");
                    else
                        System.out.println("Больше");
                    System.out.println("Попробуйте еще:");

                }
            } catch (NumberFormatException nfe) {
                System.out.println("Ошибка ввода");
            }
        }
    }
}
