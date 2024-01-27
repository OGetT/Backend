package com.example.ogett.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @GetMapping("/order")
    public String ProductRegistration() {
        return "/order/order";
    }



}
