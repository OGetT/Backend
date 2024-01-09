package com.example.ogett.Controller;

import com.example.ogett.Entity.Member;
import com.example.ogett.Repository.MemberRepository;
import com.example.ogett.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "member/Login";
    }
    @GetMapping("/membership")
    public String membership(){
        return "member/Membership";
    }

    @PostMapping("/membership")
    public String Cmembership(){
        return "index";
    }
//    @PostMapping("/login")
//    public String saveUser(Member member) {
//        memberRepository.save(member);
//        return "redirect:/";
//    }
    @GetMapping("/cart")
    public String cart(){
        return "Cart";
    }

    @GetMapping("/ai")
    public String ai(){
        return "AI";
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
