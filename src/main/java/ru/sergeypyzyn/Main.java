package ru.sergeypyzyn;

import ru.sergeypyzyn.controllers.Shop;
import ru.sergeypyzyn.models.Customer;
import ru.sergeypyzyn.repositories.CustomerRepository;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.addCustomer(new Customer("Ivan", "8888", 25, Gender.MALE));
        customerRepository.addCustomer(new Customer("Anna", "9999", 20, Gender.FEMALE));

        System.out.println(customerRepository);

    }
}