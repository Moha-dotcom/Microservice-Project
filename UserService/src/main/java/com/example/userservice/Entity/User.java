package com.example.userservice.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int user_id;
    private String username;
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }

    public User(int user_id, String username) {
        this.user_id = user_id;
        this.username = username;
    }
}
