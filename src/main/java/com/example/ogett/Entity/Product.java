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

    @Lob
    @Column(name = "image_data", columnDefinition = "BLOB")
    private byte[] imageData;

    private String name;

    // price 필드의 타입을 double로 변경
    private double price;

    private String type;

    public Product(byte[] imageData, String name, double price, String type) {
        this.imageData = imageData;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Product() {
    }
}