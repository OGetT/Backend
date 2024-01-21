package com.example.ogett.DTO;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 필요한 import 구문 추가
@Getter
@Setter
@ToString
public class ProductDTO {

    private byte[] imageData;
    private String name;

    // price 필드의 타입을 double로 변경
    private double price;

    private String type;

    public ProductDTO() {
    }

    public ProductDTO(byte[] imageData, String name, double price, String type) {
        this.imageData = imageData;
        this.name = name;
        this.price = price;
        this.type = type;
    }
}