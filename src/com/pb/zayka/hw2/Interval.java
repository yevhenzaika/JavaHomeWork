package com.pb.zayka.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb;

        System.out.println("Введите целое число:");
        numb = scan.nextInt();

        if ((numb >= 0) && (numb <= 14))
            System.out.println("[0 -14]");
        else {
            if ((numb >= 15) && (numb <= 35))
                System.out.println("[15 - 35]");
            else {
                if ((numb >= 36) && (numb <= 50))
                    System.out.println("[36 - 50]");
                else {
                    if ((numb >= 51) && (numb <= 100))
                        System.out.println("[51 - 100]");
                    else
                        System.out.println("Введенное число не попадает в один из имеющихся промежутков");
                }

            }
        }



    }
}
