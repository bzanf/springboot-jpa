package org.project.springboot_jpa.config;

import org.project.springboot_jpa.entities.User;
import org.project.springboot_jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Jorge", "jorge@email.com", "988888888", "1234");
        User user2 = new User(null, "Carlin", "carlin@email.com", "977777777", "1234");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
