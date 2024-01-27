package com.example.ogett.Controller;

import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
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


    @PostMapping("/product_registration")
    public String saveProduct(@RequestParam("image") MultipartFile image,
                              @RequestParam("name") String name,
                              @RequestParam("price") String price,
                              @RequestParam("type") String type,
                              @RequestParam("author") String author,
                              @RequestParam("description") String description) throws IOException {

        // MultipartFile을 byte[]로 변환
        byte[] imageData = image.getBytes();

        // ProductDTO 생성 및 데이터 설정
        ProductDTO productDTO = new ProductDTO();
        productDTO .setImageData(imageData);
        productDTO.setName(name);
        productDTO.setPrice(Double.parseDouble(price));
        productDTO.setType(type);
        productDTO.setAuthor(author);
        productDTO.setDescription(description);

        // ProductService를 통해 상품 등록
        productService.registerProduct(productDTO);

        // 등록 완료 시 홈 화면으로 이동
        return "redirect:/";
    }

}