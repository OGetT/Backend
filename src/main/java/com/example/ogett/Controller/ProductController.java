package com.example.ogett.Controller;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/new")
    public String showProductForm() {
        return "Product.html";
    }

    @PostMapping("/register")
    public String registerProduct(@RequestBody ProductDTO productDTO) {
        productService.registerProduct(productDTO);
        return "redirect:/products/new"; // 리다이렉트 URL 업데이트
    }
}