package com.example.ogett.Service;

import com.example.ogett.Controller.MemberController;
import com.example.ogett.DTO.MemberDTO;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(MemberController.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class MemberServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private MemberService memberService;

    @Test
    @Transactional
    public void testRegisterMember() throws Exception {
        // 테스트에 사용할 회원 DTO 생성
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setUsername("testUser");
        memberDTO.setEmail("test@example.com");
        memberDTO.setName("Test User");
        memberDTO.setPhoneNum("123456789");
        memberDTO.setBirthdate("2000-01-01");
        memberDTO.setPassword("password");
        memberDTO.setGender("Male");

        // MockMvc를 사용하여 POST 요청을 보내고, 응답을 확인
        mockMvc.perform(MockMvcRequestBuilders.post("/Membership.html")
                        .param("username", memberDTO.getUsername())
                        .param("email", memberDTO.getEmail())
                        .param("name", memberDTO.getName())
                        .param("phoneNum", memberDTO.getPhoneNum())
                        .param("birthdate", memberDTO.getBirthdate())
                        .param("password", memberDTO.getPassword())
                        .param("gender", memberDTO.getGender()))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection()); // 적절한 리다이렉션 상태 코드로 확인
    }

    @Test
    @Transactional
    public void testLoginMember() throws Exception {
        // 테스트에 사용할 회원 ID와 비밀번호
        String memberId = "testUser";
        String password = "password";

        // 회원 가입
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setUsername(memberId);
        memberDTO.setEmail("test@example.com");
        memberDTO.setName("Test User");
        memberDTO.setPhoneNum("123456789");
        memberDTO.setBirthdate("2000-01-01");
        memberDTO.setPassword(password);
        memberDTO.setGender("Male");
        memberService.registerMember(memberDTO);

        // MockMvc를 사용하여 POST 요청을 보내고, 응답을 확인
        mockMvc.perform(MockMvcRequestBuilders.post("/login")
                        .param("memberId", memberId)
                        .param("password", password))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection()); // 적절한 리다이렉션 상태 코드로 확인
    }
}