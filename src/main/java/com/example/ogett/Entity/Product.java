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

    // imageData의 목적을 설명하는 주석 수정
    // imageData에 이진 데이터(이미지 등)를 저장하기 위해 byte[] 사용
    @Lob
    @Column(name = "image_data", columnDefinition = "BLOB")
    private byte[] imageData;

    // 속성 목적을 설명하는 주석 추가
    private String name;
    private String price;
    private String type;

    // 주어진 값으로 Product 엔터티를 초기화하는 생성자
    public Product(byte[] imageData, String name, String price, String type) {
        this.imageData = imageData;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    // JPA에서 필요한 기본 생성자
    public Product() {
    }
}