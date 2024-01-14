package ru.sergeypyzyn.exceptions;

public class OrderException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Ошибка! Заказа не существует!";
    }
}
