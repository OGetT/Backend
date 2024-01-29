package com.example.ogett.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItemDTO {
    private Long id;
    private ProductDTO product;
    private Integer quantity;

    // 생성자, getters, setters
}