package com.example.ogett.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "member/Login";
    }

    @GetMapping("/cart")
    public String cart(){
        return "Cart";
    }

    @GetMapping("/ai")
    public String ai(){
        return "AI";
    }

    @GetMapping("/membership")
    public String membership(){
        return "Membership";
    }

    @GetMapping("/payment")
    public String payment(){
        return "Payment";
    }

    @GetMapping("/product")
    public String product(){
        return "Product";
    }

    @GetMapping("/wishlist")
    public String wishlist(){
        return "Wishlist";
    }



}
