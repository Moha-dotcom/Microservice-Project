package com.example.order_service.Controller;

import com.example.order_service.Entity.Order;
import com.example.order_service.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping()
    public List<Order> getallorder(){
        return  orderService.getListofOrder();
    }

    @PostMapping()
    public Order addOrder(@RequestBody Order order) throws Exception {
        return orderService.addOrder(order);
    }
}
