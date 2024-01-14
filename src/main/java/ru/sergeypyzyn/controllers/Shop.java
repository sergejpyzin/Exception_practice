package ru.sergeypyzyn.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.sergeypyzyn.Gender;
import ru.sergeypyzyn.HolidayDate;
import ru.sergeypyzyn.exceptions.AmountException;
import ru.sergeypyzyn.exceptions.CustomerException;
import ru.sergeypyzyn.exceptions.ProductException;
import ru.sergeypyzyn.models.Customer;
import ru.sergeypyzyn.models.Order;
import ru.sergeypyzyn.models.Product;
import ru.sergeypyzyn.repositories.CustomerRepository;
import ru.sergeypyzyn.repositories.OrderRepository;
import ru.sergeypyzyn.repositories.ProductRepository;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {

    private CustomerRepository customerRepository;
    private ProductRepository productRepository;
    private OrderRepository orderRepository;


    public void fillingCustomerRepository(Customer customer){
        customerRepository.addCustomer(customer);
    }
    public void fillingProductRepository(Product product){
        productRepository.addProduct(product);
    }

    public void fillingOrderRepository(Order order){
        orderRepository.addOrder(order);
    }



    public Order creatingAnOrder (Customer customer, Product product, int amount){
        if (!customerRepository.getCustomers().contains(customer)){
            throw new CustomerException();
        }
        if (!productRepository.getProducts().contains(product)){
            throw new ProductException();
        }
        if (amount < 0){
            throw new AmountException();
        }
        return new Order(customer, product, amount);
    }

    public void congratulation(CustomerRepository customerRepository, HolidayDate holidayDate){
        List<Customer> customers = customerRepository.getCustomers();
        LocalDate localDate = LocalDate.now();

        switch (holidayDate){
            case NEW_YEAR -> System.out.println("С НОВЫМ ГОДОМ ДОРОГОЙ ПОКУПАТЕЛЬ!");
            case DEFENDER_OF_FATHERLAND_DAY -> customers.stream()
                    .filter(customer -> customer.getGender() == Gender.MALE)
                    .forEach(customer -> System.out.println("ПОЗДРАВЛЯЕМ С ДНЕМ ЗАЩИТНИКА ОТЕЧЕСТВА!"));
            case INTERNATIONAL_WOMAN_DAY -> customers.stream()
                    .filter(customer -> customer.getGender() == Gender.FEMALE)
                    .forEach(customer -> System.out.println("ПОЗДРАВЛЯЕМ С МЕЖДУНАРОДНЫМ ЖЕНСКИЙ ДНЕМ!"));
            case SPRING_AND_LABOR_DAY -> System.out.println("ПОЗДРАВЛЯЕМ С ДНЕМ ВЕСНЫ И ТРУДА!");
            case VICTORY_DAY -> System.out.println("ПОЗДРАВЛЯЕМ С ДНЕМ ПОБЕДЫ!");
        }
    }

    public void countOrders (OrderRepository orderRepository){
        List<Order> orders = orderRepository.getOrders();
        orders.removeIf(order -> false);
        System.out.println("Количество произведенных заказов: " + orders.size());
    }

}
