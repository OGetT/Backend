package com.example.ogett.Service;


//Impl에 있는 요소들을 선언해둔 Service 주로 Service가 다른 요소들과 소통하는 브릿지 역할을 한다

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Entity.Product;

import java.util.List;

public interface ProductService {
    void registerProduct(ProductDTO productDTO);

    List<Product> getAllProducts();

    ProductDTO getProductDTOById(Long id);

    List<ProductDTO> getAllProductsDTO();

    List<ProductDTO> searchProducts(String keyword);
    Product getProductById(Long id);
}

