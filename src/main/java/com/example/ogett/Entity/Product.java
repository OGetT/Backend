package com.example.ogett.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "product")
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 바이트 배열로 수정
    @Lob
    @Column(name = "image_data", columnDefinition = "BLOB")
    private byte[] imageData;


    private String name;

    private String price;

    private String type;


    // 생성자
    public Product(byte[] imageData, String name, String price, String type) {
        this.imageData = imageData;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    // 기본 생성자
    public Product() {
    }



}

