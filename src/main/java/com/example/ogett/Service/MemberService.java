package com.example.ogett.Service;

import com.example.ogett.DTO.MemberDTO;
import com.example.ogett.Entity.Member;
import com.example.ogett.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void registerMember(MemberDTO memberDTO) {
        Member member = new Member();
        member.setEmail(memberDTO.getEmail());
        member.setName(memberDTO.getName());
        member.setPhoneNum(memberDTO.getPhoneNum());
        member.setBirthdate(memberDTO.getBirthdate());
        member.setPassword(memberDTO.getPassword()); // 간단히 비밀번호 그대로 저장
        member.setGender(memberDTO.getGender());

        memberRepository.save(member);
    }
}

