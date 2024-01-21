package com.example.ogett.Controller;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/new")
    public String showProductForm() {
        return "Product";
    }

    @PostMapping("/register")
    public String registerProduct(@RequestParam("product-image") MultipartFile image,
                                  @RequestParam("product-name") String name,
                                  @RequestParam("product-price") double price,
                                  @RequestParam("product-category") String category,
                                  @RequestParam("product-description") String description,
                                  @RequestParam("product-author") String author) throws IOException {
        // MultipartFile을 byte[]로 변환
        byte[] imageData = image.getBytes();

        // ProductDTO 생성 및 데이터 설정
        ProductDTO productDTO = new ProductDTO(imageData, name, price, category, description, author);

        // ProductService를 통해 상품 등록
        productService.registerProduct(productDTO);

        return "redirect:/products/new";
    }
}