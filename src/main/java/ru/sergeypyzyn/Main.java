package ru.sergeypyzyn;

import ru.sergeypyzyn.controllers.Shop;
import ru.sergeypyzyn.enums.Gender;
import ru.sergeypyzyn.enums.HolidayDate;
import ru.sergeypyzyn.exceptions.AmountException;
import ru.sergeypyzyn.exceptions.CustomerException;
import ru.sergeypyzyn.exceptions.ProductException;
import ru.sergeypyzyn.models.Customer;
import ru.sergeypyzyn.models.Product;
import ru.sergeypyzyn.repositories.CustomerRepository;
import ru.sergeypyzyn.repositories.OrderRepository;
import ru.sergeypyzyn.repositories.ProductRepository;


public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        CustomerRepository customerRepository = new CustomerRepository();
        customerRepository.addCustomer(new Customer("Ivan", "8888", 25, Gender.MALE));
        customerRepository.addCustomer(new Customer("Anna", "9999", 20, Gender.FEMALE));

        System.out.println(customerRepository);

        ProductRepository productRepository = new ProductRepository();

        productRepository.addProduct(new Product("Puzzle", 3654.00));
        productRepository.addProduct(new Product("Car", 9999.99));
        productRepository.addProduct(new Product("Robot", 15000));
        productRepository.addProduct(new Product("Barbie", 6666.00));
        productRepository.addProduct(new Product("Ken", 6666.00));

        System.out.println(productRepository);

        shop.setCustomerRepository(customerRepository);
        shop.setProductRepository(productRepository);
        System.out.println(shop);

        OrderRepository orderRepository = new OrderRepository();

        try {
            orderRepository.addOrder(shop.creatingAnOrder(customerRepository.getCustomers().get(0),
                    productRepository.getProducts().get(0), 5));
            orderRepository.addOrder(shop.creatingAnOrder(customerRepository.getCustomers().get(1),
                    productRepository.getProducts().get(1), 5));
            orderRepository.addOrder(shop.creatingAnOrder(customerRepository.getCustomers().get(1),
                    productRepository.getProducts().get(2), 5));
            orderRepository.addOrder(shop.creatingAnOrder(customerRepository.getCustomers().get(0),
                    productRepository.getProducts().get(3), 5));
            orderRepository.addOrder(shop.creatingAnOrder(customerRepository.getCustomers().get(1),
                    productRepository.getProducts().get(4), 5));
            orderRepository.addOrder(shop.creatingAnOrder(new Customer("Sergey", "7777", 42, Gender.MALE),
                    productRepository.getProducts().get(0), 6));
            orderRepository.addOrder(shop.creatingAnOrder(customerRepository.getCustomers().get(0),
                    new Product("Ball", 666.35), 6));
            orderRepository.addOrder(shop.creatingAnOrder(customerRepository.getCustomers().get(0),
                    productRepository.getProducts().get(0), 0));
        } catch (CustomerException | ProductException | AmountException e) {
            e.printStackTrace();
        }

        System.out.println(orderRepository);
        try {
            shop.congratulation(customerRepository, HolidayDate.NEW_YEAR);
            shop.congratulationForTest(customerRepository, HolidayDate.DEFENDER_OF_FATHERLAND_DAY, "2024-02-23");

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        shop.countOrders(orderRepository);

    }
}