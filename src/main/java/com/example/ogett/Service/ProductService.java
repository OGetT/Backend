package com.example.ogett.Service;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Entity.Product;
import com.example.ogett.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

        product.setImageData(productDTO.getImageData());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setType(productDTO.getType());
        product.setDescription(productDTO.getDescription());
        product.setAuthor(productDTO.getAuthor());


        // 레포지토리를 사용하여 제품 엔터티를 데이터베이스에 저장
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        // 모든 제품을 가져오는 메서드
        return productRepository.findAll();
    }

    public ProductDTO getProductDTOById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("해당 ID의 제품을 찾을 수 없습니다: " + id));

        return convertToDTO(product);
    }

    public List<ProductDTO> getAllProductsDTO() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ProductDTO convertToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setImageData(product.getImageData());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setType(product.getType());
        productDTO.setDescription(product.getDescription());
        productDTO.setAuthor(product.getAuthor());
        return productDTO;
    }
}