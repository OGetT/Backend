package com.example.ogett.Service;

import com.example.ogett.Constant.Gender;
import com.example.ogett.DTO.MemberDTO;
import com.example.ogett.Entity.Member;
import com.example.ogett.Repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceTest {

        @Autowired
        private MemberService memberService;

        @Autowired
        private MemberRepository memberRepository;

        @Test
        public void testRegisterMember() {
            // Given
            MemberDTO memberDTO = new MemberDTO();
            memberDTO.setEmail("test@example.com");
            memberDTO.setName("Test User");
            memberDTO.setPhoneNum("1234567890");
            memberDTO.setBirthdate("1990-01-01");
            memberDTO.setPassword("password");
            memberDTO.setGender(Gender.MALE);

            // When
            memberService.registerMember(memberDTO);

            // Then
            Optional<Member> savedMember = memberRepository.findByEmail("test@example.com");
            assertTrue(savedMember.isPresent());
            assertEquals("Test User", savedMember.get().getName());
            assertEquals("1234567890", savedMember.get().getPhoneNum());
            assertEquals("1990-01-01", savedMember.get().getBirthdate());
            assertEquals(Gender.MALE, savedMember.get().getGender());
            // 비밀번호 검증은 일반적으로 해싱 등의 복잡한 로직이 들어가므로 간단한 평문 비밀번호 검증만을 예시로 작성
            assertEquals("password", savedMember.get().getPassword());
        }
    }
