package com.example.order_service;

import com.example.order_service.Entity.Order;
import com.example.order_service.Entity.Product;
import com.example.order_service.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {




    }
}
