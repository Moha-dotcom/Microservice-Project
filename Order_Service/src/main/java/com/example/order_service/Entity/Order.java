package com.example.order_service.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
@ToString
public class Order {

    private int id;
    private String orderNumber;


}
