package ru.sergeypyzyn.exceptions;

public class AmountException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Ошибка! Количество товара, для заказа, задано некорректно!";
    }
}
