package com.example.ogett.DTO;

// 필요한 import 구문 추가
public class ProductDTO {

    // 필드 추가
    private byte[] imageData;
    private String name;
    private double price;
    private String type;

    // 생성자 추가
    public ProductDTO() {
    }

    public ProductDTO(byte[] imageData, String name, double price, String type) {
        this.imageData = imageData;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    // Getter 및 Setter 추가
    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
