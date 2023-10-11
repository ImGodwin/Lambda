import entities.Customer;
import entities.Order;
import entities.Product;
import org.w3c.dom.ls.LSOutput;

import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Random randomNumber = new Random();

        Customer customer = new Customer(randomNumber.nextInt(0, 30), "Kade", 4);
        Customer customer2 = new Customer(randomNumber.nextInt(0, 30), "Weeknd", 1);
        Customer customer3 = new Customer(randomNumber.nextInt(0, 30), "Warriior", 3);
        Customer customer4 = new Customer(randomNumber.nextInt(0, 30), "Lion", 5);
        Customer customer5 = new Customer(randomNumber.nextInt(0, 30), "Cat", 2);

        Product product1 = new Product(randomNumber.nextInt(0, 100), "Shakespeare", "Books",
                randomNumber.nextInt(50, 200));
        Product product2 = new Product(randomNumber.nextInt(0, 100), "Long Island", "Baby",
                randomNumber.nextInt(50, 200));
        Product product3 = new Product(randomNumber.nextInt(0, 100), "Jaws", "Boy",
                randomNumber.nextInt(50, 200));
        Product product4 = new Product(randomNumber.nextInt(0, 100), "Kids", "Books",
                randomNumber.nextInt(50, 200));
        Product product5 = new Product(randomNumber.nextInt(0, 100), "Parent", "Baby",
                randomNumber.nextInt(50, 200));
        Product product6 = new Product(randomNumber.nextInt(0, 100), "Hormones", "Boy",
                randomNumber.nextInt(50, 200));
        Product product7 = new Product(randomNumber.nextInt(0, 100), "Christian", "Books",
                randomNumber.nextInt(50, 200));
        Product product8 = new Product(randomNumber.nextInt(0, 100), "Tech", "Baby",
                randomNumber.nextInt(50, 200));
        Product product9 = new Product(randomNumber.nextInt(0, 100), "AI", "Boy",
                randomNumber.nextInt(50, 200));
        Product product10 = new Product(randomNumber.nextInt(0, 100), "Job", "Books",
                randomNumber.nextInt(50, 200));

        Product[] productsArr = {product1, product2, product3, product4, product5, product6,
                product7, product8, product9, product10};


        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<1<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        LocalDate date = LocalDate.of(2023, Month.OCTOBER, 11);
        //System.out.println(date);

        List<Product> eachProduct = new ArrayList<>(Arrays.asList(productsArr));
        List<Product> onlyBooks = eachProduct.stream().filter(book -> book.getCategory().equals("Books") && book.getPrice() > 100).toList();
        onlyBooks.forEach(System.out::println);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<2<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        //creating orders
        LocalDate deliveryDate = LocalDate.of(2023, Month.OCTOBER, 19);
        Order order = new Order(randomNumber.nextInt(0, 100), "On Sale", date, deliveryDate, eachProduct, customer3);
        Order order2 = new Order(randomNumber.nextInt(0, 100), "On Sale", date, deliveryDate, eachProduct, customer4);
        Order order3 = new Order(randomNumber.nextInt(0, 100), "On Sale", date, deliveryDate, eachProduct, customer2);
        Order order4 = new Order(randomNumber.nextInt(0, 100), "On Sale", date, deliveryDate, eachProduct, customer2);
        Order order5 = new Order(randomNumber.nextInt(0, 100), "On Sale", date, deliveryDate, eachProduct, customer2);
        Order order6 = new Order(randomNumber.nextInt(0, 100), "On Sale", date, deliveryDate, eachProduct, customer2);
        Order order7 = new Order(randomNumber.nextInt(0, 100), "On Sale", date, deliveryDate, eachProduct, customer2);

        List<Order> orders = new ArrayList<>();
        orders.add(order);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);
        //System.out.println(orders);

        Predicate<Order> equalsBabies = str -> str.getProducts().stream().anyMatch(el -> el.getCategory().equals("Baby"));

        List<Order> completeOrder = orders.stream().filter(equalsBabies).toList();
        completeOrder.forEach(System.out::println);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<3<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        Predicate<Product> boysCategory = boy -> boy.getCategory().equals("Boy");
        //System.out.println(boysCategory);
        {
        eachProduct.stream().filter(boysCategory).map(el-> {

            el.setPrice((el.getPrice() / 10) * 100);
            return el;
        }).forEach(System.out::println);



    }


}}
