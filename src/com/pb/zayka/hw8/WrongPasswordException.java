package com.pb.zayka.hw8;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
