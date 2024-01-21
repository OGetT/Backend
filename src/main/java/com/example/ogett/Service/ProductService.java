package com.example.ogett.Service;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Entity.Product;
import com.example.ogett.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// ProductService
@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void registerProduct(ProductDTO productDTO) {
        // Product 엔터티 생성
        Product product = new Product();

        // ProductDTO에서 엔터티로 속성 설정
        product.setImageData(productDTO.getImageData());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setType(productDTO.getType());
        // 기타 필요한 속성도 설정 가능

        // 레포지토리를 사용하여 제품 엔터티를 데이터베이스에 저장
        productRepository.save(product);
    }
}
