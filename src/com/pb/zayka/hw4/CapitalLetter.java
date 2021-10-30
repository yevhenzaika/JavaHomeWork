package com.pb.zayka.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //String str = "истина — это то, что выдерживает проверку опытом. Эйнштейн А.";
        System.out.println("Введите строку:");
        String str = in.nextLine();
        System.out.println(toCapitalLetter(str));

    }

    public static String toCapitalLetter(String str) {
        StringBuilder builder = new StringBuilder(str);

        if (Character.isLetter(str.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i)) && Character.isSpaceChar(str.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(str.charAt(i)));

        return builder.toString();

    }
}
