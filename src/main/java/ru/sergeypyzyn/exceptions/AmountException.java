package ru.sergeypyzyn.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class AmountException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Ошибка! Количество товара задано некорректно!";
    }
}
