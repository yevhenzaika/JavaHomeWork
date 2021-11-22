package com.pb.zayka.hw8;

public class Auth {

    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.matches("[a-zA-Z0-9]{5,20}")) {
            this.login = login;
        } else {
            throw new WrongLoginException("логин не соответствует требованиям");
        }

        if (!password.matches("\\w{5,}")) {
            throw new WrongPasswordException("пароль не соответствует требованиям");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("пароли не совпадают");
        } else {
            this.password = password;
        }
    }

    public void signIn(String login, String password) throws WrongLoginException {

        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Успешная авторизация");
        } else {
            throw new WrongLoginException("неправильный логин иил пароль");
        }
    }
}
