package com.by.gson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter

@NoArgsConstructor
public class Product {

    private String code;
    private String name;
    private int price;


    public Product(String code, String name, int price) {
        this.code=code;
        this.name=name;
        this.price=price;

    }
}
