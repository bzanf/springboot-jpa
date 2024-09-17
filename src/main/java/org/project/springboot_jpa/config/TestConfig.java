package org.project.springboot_jpa.config;

import org.project.springboot_jpa.entities.Order;
import org.project.springboot_jpa.entities.User;
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

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Jorge", "jorge@email.com", "988888888", "1234");
        User user2 = new User(null, "Carlos", "carlos@email.com", "977777777", "1234");

        Order order1 = new Order(null, Instant.parse("2023-03-05T10:02:55Z"), user1);
        Order order2 = new Order(null, Instant.parse("2024-09-03T07:55:21Z"), user2);
        Order order3 = new Order(null, Instant.parse("2021-11-25T19:21:33Z"), user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
