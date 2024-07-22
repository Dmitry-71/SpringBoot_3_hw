package ru.netology.springboot_3_hw.exception;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }

    public void printStackTrace() {
    }
}
