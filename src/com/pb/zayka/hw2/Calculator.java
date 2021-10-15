package com.pb.zayka.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.println("Введите первый операнд:");
        operand1 = scan.nextInt();

        System.out.println("Введите второй операнд:");
        operand2 = scan.nextInt();

        System.out.println("Введите арифметическую операцию (+ - * /) :");
        sign = scan.next();

        char c = sign.charAt(0);

        switch (c) {
            case '+':
                System.out.println("Результат = " + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Результат = " + (operand1 - operand2));
                break;
            case '*':
                System.out.println("Результат = " + (operand1 * operand2));
                break;
            case '/':
                if (operand2 == 0){
                    System.out.println("Ошибка. Деление на ноль");
                }
                else {
                    System.out.println("Результат = " + (operand1 / operand2));
                }
                break;
            default:
                System.out.println("Неверный оператор");
        }


    }
}
