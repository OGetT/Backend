package com.example.ogett.Controller;

import com.example.ogett.Service.MemberService;
import com.example.ogett.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
