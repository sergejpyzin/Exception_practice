package ru.sergeypyzyn.exceptions;

public class ProductException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Ошибка! Товара не существует!";
    }
}
