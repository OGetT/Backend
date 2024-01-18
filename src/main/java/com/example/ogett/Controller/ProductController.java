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

    // 상품 등록 폼을 보여주는 메서드
    @RequestMapping("/new")
    public String showProductForm() {
        return "Product.html"; // ProductForm.html로 이동
    }

    // 상품 등록을 처리하는 메서드
    @PostMapping("/register")
    public String registerProduct(@RequestBody ProductDTO productDTO) {
        // ProductService의 registerProduct 메서드 호출
        productService.registerProduct(productDTO);

        // 등록이 성공하면 Product.html로 리다이렉트
        return "redirect:/products/Product";
    }
}