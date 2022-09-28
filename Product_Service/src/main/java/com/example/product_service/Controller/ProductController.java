package com.example.product_service.Controller;

import com.example.product_service.Entity.Product;
import com.example.product_service.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping
    public List<Product> getAllProduct(){
        return service.getallProducts();
    }
    @GetMapping("/{product_id}")
    public Optional<Product> getProduct(@PathVariable int product_id){
        return service.getProduct(product_id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }
}
