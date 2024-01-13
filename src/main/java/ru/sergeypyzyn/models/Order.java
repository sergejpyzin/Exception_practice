package ru.sergeypyzyn.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Customer customer;
    private Product product;
    private int value;
    private LocalDate date;
}
