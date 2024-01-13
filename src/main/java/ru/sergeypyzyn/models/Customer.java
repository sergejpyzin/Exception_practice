package ru.sergeypyzyn.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.sergeypyzyn.Gender;

@Data
@AllArgsConstructor
public class Customer {

    private String customerName;
    private String phoneNumber;
    private int age;
    private final Gender gender;

}
