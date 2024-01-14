package ru.sergeypyzyn.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.sergeypyzyn.models.Order;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class OrderRepository {

    private List<Order> orders;

    public OrderRepository (){
        this.orders = new ArrayList<>();
    }

    public List<Order> getAllOrders (){
        return new ArrayList<>(orders);
    }

    public void addOrder (Order order){
        orders.add(order);
    }

    public void removeOrder (Order order){
        orders.remove(order);
    }


}
