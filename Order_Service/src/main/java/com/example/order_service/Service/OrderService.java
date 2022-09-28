package com.example.order_service.Service;

import com.example.order_service.Data.OrderRepository;
import com.example.order_service.Entity.Order;
import com.example.order_service.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    @Autowired
    RestTemplate restTemplate;


    public List<Order> getListofOrder(){
        return repository.findAll();
    }



    public Order addOrder(Order order) throws Exception {

        return repository.save(order);

    }



}
