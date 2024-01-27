package com.example.ogett.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "image_data", columnDefinition = "BLOB")
    private byte[] imageData;

    private String name;
    private double price;
    private String type;
    private String description;
    private String author;

    // 매개변수가 있는 생성자
    public Product(byte[] imageData, String name, double price, String type, String description, String author) {
        this.imageData = imageData;
        this.name = name;
        this.price = price;
        this.type = type;
        this.description = description;
        this.author = author;
    }

    // 기본 생성자
    public Product() {
        // 아무 작업도 수행하지 않음
    }
}