package com.example.product_service;

import com.example.product_service.Data.ProductRepository;
import com.example.product_service.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiceApplication implements CommandLineRunner {

    @Autowired
    ProductRepository repository;


    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Product product = new Product(90, "Umbra Dima Mirrors", "Set of 3, Trio of Decorative Mirrors for Wall — Apartment Décor/Wall Art, Available in Black", 10, 45.90);
        repository.save(product);
    }
}
