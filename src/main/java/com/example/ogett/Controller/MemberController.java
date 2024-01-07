package com.example.ogett.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/login")
    public String login(){
        return "member/login";
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

}
