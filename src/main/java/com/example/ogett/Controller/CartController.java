package com.example.ogett.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @GetMapping("/Cart")
    public String ProductRegistration() {
        return "/Cart/Cart";
    }

}
