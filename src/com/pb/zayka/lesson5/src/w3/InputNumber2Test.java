package com.pb.zayka.lesson5.src.w3;

import java.util.Scanner;

public class InputNumber2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ведите число: ");
            int input = scanner.nextInt();
            if (input == 007) {
                break;
            }
        }
    }
}
