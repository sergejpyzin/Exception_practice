package ru.sergeypyzyn.exceptions;

public class CustomerException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Ошибка! Покупателя не существует!";
    }
}
