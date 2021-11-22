package com.pb.zayka.hw8;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Регистрация");
        System.out.println("Введите логин для регистрации, от 5 до 20 символов, должен содержать только латинские буквы и цифры:");
        String login = sc.nextLine();
        System.out.println("Введите пароль для регистрации, длинна более 5, только латинские буквы и цифры и знак подчеркивания:");
        String password = sc.nextLine();
        System.out.println("Введите пароль еще раз:");
        String confirmPassword = sc.nextLine();

        Auth auth = new Auth();

        try {
            auth.signUp(login, password, confirmPassword);

            System.out.println("Авторизация");
            System.out.println("Введите логин:");
            login = sc.nextLine();
            System.out.println("Введите пароль:");
            password = sc.nextLine();

            auth.signIn(login, password);

        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
