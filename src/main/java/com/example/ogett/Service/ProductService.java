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

    public void registerProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setImageData(productDTO.getImageData());
        product.setName(productDTO.getName());
        product.setPrice(String.valueOf(productDTO.getPrice()));
        product.setType(productDTO.getType());

        productRepository.save(product);
    }

}
