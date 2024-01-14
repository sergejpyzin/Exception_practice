package ru.sergeypyzyn.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class OrderException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Ошибка! Заказа не существует!";
    }
}
