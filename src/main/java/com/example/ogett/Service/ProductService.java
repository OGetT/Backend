package com.example.ogett.Service;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Entity.Product;
import com.example.ogett.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // 상품 등록 메서드
    public void registerProduct(ProductDTO productDTO) {
        // 새로운 Product 엔터티 생성
        Product product = new Product();

        // DTO에서 엔터티로 속성 설정
        product.setImageData(productDTO.getImageData());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice()); // 변경된 부분: String.valueOf(productDTO.getPrice())에서 productDTO.getPrice()로 수정
        product.setType(productDTO.getType());

        // 레포지토리를 사용하여 제품 엔터티를 데이터베이스에 저장
        productRepository.save(product);
    }
}