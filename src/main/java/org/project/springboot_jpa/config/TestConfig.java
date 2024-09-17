package org.project.springboot_jpa.config;

import org.project.springboot_jpa.entities.Category;
import org.project.springboot_jpa.entities.Order;
import org.project.springboot_jpa.entities.User;
import org.project.springboot_jpa.entities.enums.OrderStatus;
import org.project.springboot_jpa.repositories.CategoryRepository;
import org.project.springboot_jpa.repositories.OrderRepository;
import org.project.springboot_jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category category1 = new Category(null, "Books");
        Category category2 = new Category(null, "Computers");
        Category category3 = new Category(null, "Games");

        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));


        User user1 = new User(null, "Jorge", "jorge@email.com", "988888888", "1234");
        User user2 = new User(null, "Carlos", "carlos@email.com", "977777777", "1234");

        Order order1 = new Order(null, Instant.parse("2023-03-05T10:02:55Z"), OrderStatus.PAID, user1);
        Order order2 = new Order(null, Instant.parse("2024-09-03T07:55:21Z"), OrderStatus.WAITING_PAYMENT, user2);
        Order order3 = new Order(null, Instant.parse("2021-11-25T19:21:33Z"), OrderStatus.SHIPPED, user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
