package com.example.userservice.Entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private String desc;
    private int quantity;
    private double price;

}
