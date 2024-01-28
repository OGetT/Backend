package com.example.ogett.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 필요한 import 구문 추가
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private byte[] imageData;
    private String name;
    private double price;
    private String type;
    private String description;
    private String author;
}