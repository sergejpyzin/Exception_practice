package ru.sergeypyzyn.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.sergeypyzyn.models.Customer;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class CustomerRepository {

    private List<Customer> customers;

    public CustomerRepository(){
        this.customers = new ArrayList<>();
    }

    public List<Customer> getAllCustomer (){
        return new ArrayList<>(customers);
    }

    public void addCustomer (Customer customer){
        customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }


}
