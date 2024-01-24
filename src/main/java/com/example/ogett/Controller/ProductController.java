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
    @GetMapping("/product_registration")
    public String showProductRegistrationForm() {
        return "product_registration";
    }


    @GetMapping("/new")
    public String showProductForm() {
        return "forward:/Product_registration.html";
    }

    @PostMapping("/register")
    public String registerProduct(@RequestParam("image") MultipartFile image,
                                  @RequestParam("name") String name,
                                  @RequestParam("price") double price,
                                  @RequestParam("category") String category,
                                  @RequestParam("description") String description,
                                  @RequestParam("author") String author) throws IOException {
        // MultipartFile을 byte[]로 변환
        byte[] imageData = image.getBytes();

        // ProductDTO 생성 및 데이터 설정
        ProductDTO productDTO = new ProductDTO(imageData, name, price, category, description, author);

        // ProductService를 통해 상품 등록
        productService.registerProduct(productDTO);

        // 등록 후 다시 상품 등록 페이지로 이동
        return "redirect:/products/new";
    }
}