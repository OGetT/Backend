package com.example.ogett.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CartController {

    @GetMapping("/cart")
    public String ProductRegistration() {
        return "/Cart/cart";
    }

}
