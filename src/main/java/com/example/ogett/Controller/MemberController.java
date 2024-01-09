package com.example.ogett.Controller;

import com.example.ogett.DTO.MemberDTO;
import com.example.ogett.Entity.Member;
import com.example.ogett.Repository.MemberRepository;
import com.example.ogett.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    @RequestMapping("/")
    public String home(){
        return "index";
    }


    @RequestMapping("/membership")
    public String membership(){
        return "member/Membership";
    }
    @RequestMapping("/login")
    public String login(){
        return "member/Login";
    }
    @PostMapping("/membership")
    public String saveMember(@RequestParam MultiValueMap<String, String> formData) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setEmail(formData.getFirst("email"));
        memberDTO.setName(formData.getFirst("name"));
        memberDTO.setPhoneNum(formData.getFirst("phoneNum"));
        memberDTO.setBirthdate(formData.getFirst("birthdate"));
        memberDTO.setPassword(formData.getFirst("password"));


        memberService.registerMember(memberDTO);

        // 회원가입이 성공하면 index로 리다이렉트
        return "redirect:/";
    }

    @PostMapping("/login")
    public String loginMember(@RequestParam String memberId, @RequestParam String password, RedirectAttributes redirectAttributes) {
        // 아이디와 비밀번호를 사용하여 로그인 시도
        boolean loginSuccess = memberService.loginMemberByIdAndPassword(memberId, password);

        if (loginSuccess) {
            // 로그인이 성공하면 index로 리다이렉트
            return "redirect:/";
        } else {
            // 로그인 실패시 로그인 페이지로 이동
            // 실패 메시지를 전달하기 위해 RedirectAttributes를 사용
            redirectAttributes.addFlashAttribute("loginError", "Invalid memberId or password");
            return "redirect:/login";
        }
    }
    @RequestMapping("/cart")
    public String cart(){
        return "Cart";
    }

    @RequestMapping("/ai")
    public String ai(){
        return "AI";
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
