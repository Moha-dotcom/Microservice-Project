package com.example.userservice;

import com.example.userservice.Data.UserRepository;
import com.example.userservice.Entity.Product;
import com.example.userservice.Entity.User;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {

    @Autowired
    UserRepository repository;

    public static void main(String[] args) {

        SpringApplication.run(UserServiceApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        User user = new User(3, "Mohaze");
        user.addProduct(new Product(3,"Iphone", "Iphone 14", 90, 1290));

        repository.save(user);
    }
}
