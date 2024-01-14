package ru.sergeypyzyn.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Order {

    private Customer customer;
    private Product product;
    private int value;
    private final LocalDate date;

    public Order (Customer customer, Product product, int value){
        this.customer = customer;
        this.product = product;
        this.value = value;
        this.date = LocalDate.now();
    }

    @Override
    public String toString() {
        return String.format("Сформирован заказ: Покупатель - %s, Товар - %s, Кол-во - %d, Дата заказа - %s\n", this.customer, this.product, this.value, this.date);
    }
}
