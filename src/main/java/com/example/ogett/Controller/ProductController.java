package com.example.ogett.Controller;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Entity.Product;
import com.example.ogett.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

//    @GetMapping("/")
//    public String showAllProducts(Model model) {
//        // 모든 제품을 가져와서 모델에 추가
//        List<Product> products = productService.getAllProducts();
//        model.addAttribute("products", products);
//        return "home";
//    }

    @GetMapping("/product_registration")
    public String ProductRegistration() {
        return "/product/product_registration";
    }

    @PostMapping("/register")
    public String registerProduct(@RequestParam("image") MultipartFile image,
                                  @RequestParam("name") String name,
                                  @RequestParam("price") double price,
                                  @RequestParam("category") String category,
                                  @RequestParam("type") String type,
                                  @RequestParam("author") String author) throws IOException {
        // MultipartFile을 byte[]로 변환
        byte[] imageData = image.getBytes();

        // ProductDTO 생성 및 데이터 설정
        ProductDTO productDTO = new ProductDTO(imageData, name, price, category, type, author);

        // ProductService를 통해 상품 등록
        productService.registerProduct(productDTO);

        // 등록 완료 시 홈 화면으로 이동
        return "redirect:/";
    }
}