package com.example.ogett.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {

    //사진, 이름, 가격, 옷 종류 (ProductRegistration.jsx 참고)

    private byte[] imageData;
    
    private String name;

    private String price;

    private String type;

}
