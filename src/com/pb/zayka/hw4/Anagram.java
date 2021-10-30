package com.pb.zayka.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String str1 = in.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = in.nextLine();
/*
        String str1 = "dз есмь строка, живу я, мерой остр.";
        String str2 = "За семь морей ростка я вижу рост.";
        System.out.println(str1);
        System.out.println(str2);
*/

        isAnagram(str1, str2);

    }

    public static void isAnagram(String a, String b) {
        //System.out.println(delSymbol(a));
        //System.out.println(delSymbol(b));

        char[] char1 = delSymbol(a).toLowerCase().toCharArray();
        char[] char2 = delSymbol(b).toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
/*
        System.out.println("Отсортированные строки: ");
        System.out.println(Arrays.toString(char1));
        System.out.println(Arrays.toString(char2));
*/

        if (Arrays.toString(char1).equals(Arrays.toString(char2)))
            System.out.println("Анаграмма");
        else
            System.out.println("Не анаграмма");
    }


    public static String delSymbol (String str) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
            if (Character .isLetterOrDigit(str.charAt(i)))
                builder.append(str.charAt(i));

        return builder.toString();
    }
}
