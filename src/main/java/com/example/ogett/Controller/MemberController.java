package com.example.ogett.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

    @RequestMapping("/")
    //@ResponseBody
    public String home(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "member/Login";
    }

    @RequestMapping("/cart")
    public String cart(){
        return "Cart";
    }

    @RequestMapping("/ai")
    public String ai(){
        return "AI";
    }

    @RequestMapping("/membership")
    public String membership(){
        return "Membership";
    }

    @RequestMapping("/payment")
    public String payment(){
        return "Payment";
    }

    @RequestMapping("/product")
    public String product(){
        return "Product";
    }

    @RequestMapping("/wishlist")
    public String wishlist(){
        return "Wishlist";
    }



}
