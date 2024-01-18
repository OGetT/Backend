package com.example.ogett.Controller;

import com.example.ogett.DTO.MemberDTO;
import com.example.ogett.DTO.ProductDTO;
import com.example.ogett.Service.MemberService;
import com.example.ogett.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Base64;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product")
    public String product(){
        return "product/Product";
    }

    @RequestMapping("/productRegistration") //상품 등록 페이지
    public String productRegistration(){
        return "product/ProductRegistration";
    }
    public String saveProduct(@RequestParam MultiValueMap<String, String> formData) {
        ProductDTO productDTO = new ProductDTO();
        
        // Base64 디코딩을 통해 문자열을 byte[]로 변환
        byte[] imageData = Base64.getDecoder().decode(formData.getFirst("imageData"));

        productDTO.setName(formData.getFirst("name"));
        productDTO.setPrice(formData.getFirst("price"));
        productDTO.setType(formData.getFirst("type"));
        productService.registerProduct(productDTO);

        // 상품등록이 성공하면 index로 리다이렉트
        return "redirect:/";
    }

    @RequestMapping("/cart") //장바구니 페이지
    public String cart(){
        return "product/Cart";
    }

}
