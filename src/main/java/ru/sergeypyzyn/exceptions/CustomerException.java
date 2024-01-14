package ru.sergeypyzyn.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class CustomerException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Ошибка! Покупателя не существует!";
    }
}
