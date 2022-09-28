package com.example.product_service.Service;

import com.example.product_service.Data.ProductRepository;
import com.example.product_service.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;


    public List<Product> getallProducts(){
        return repository.findAll();
    }

    public Optional<Product> getProduct(int id){
        return repository.findById(id);

    }

    public Product addProduct(Product product){
        return repository.save(product);

    }
}
