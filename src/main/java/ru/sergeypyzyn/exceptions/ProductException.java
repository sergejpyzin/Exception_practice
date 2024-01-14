package ru.sergeypyzyn.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class ProductException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Ошибка! Товара не существует!";
    }
}
