package com.example.ogett.Service;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Entity.Product;

import java.util.List;

public interface ProductService {
    void registerProduct(ProductDTO productDTO);

    List<Product> getAllProducts();

    ProductDTO getProductDTOById(Long id);

    List<ProductDTO> getAllProductsDTO();

    List<ProductDTO> searchProducts(String keyword);
}

