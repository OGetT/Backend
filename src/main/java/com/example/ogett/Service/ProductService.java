package com.example.ogett.Service;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Entity.Product;
import com.example.ogett.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        Product product = new Product(
                productDTO.getImageData(),
                productDTO.getName(),
                productDTO.getPrice(),
                productDTO.getType(),
                productDTO.getDescription(),
                productDTO.getAuthor()
        );

        // 레포지토리를 사용하여 제품 엔터티를 데이터베이스에 저장
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        // 모든 제품을 가져오는 메서드
        return productRepository.findAll();
    }
}
