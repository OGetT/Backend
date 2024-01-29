package com.example.ogett.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CartRequest {
    private Long productId;
    private Integer quantity;

}
