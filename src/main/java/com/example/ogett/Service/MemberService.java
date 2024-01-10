package com.example.ogett.Service;

import com.example.ogett.DTO.MemberDTO;
import com.example.ogett.Entity.Member;
import com.example.ogett.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void registerMember(MemberDTO memberDTO) {
        Member member = new Member();
        member.setId(memberDTO.getId());
        member.setEmail(memberDTO.getEmail());
        member.setName(memberDTO.getName());
        member.setPhoneNum(String.valueOf(memberDTO.getPhoneNum()));
        member.setBirthdate(memberDTO.getBirthdate());
        member.setPassword(memberDTO.getPassword());

        // 성별 값을 그대로 저장
        member.setGender(memberDTO.getGender());

        memberRepository.save(member);
    }
    public boolean loginMemberByIdAndPassword(String memberId, String password) {
        Optional<Member> memberOptional = memberRepository.findByEmail(memberId);

        return memberOptional.map(member -> member.getPassword().equals(password)).orElse(false);
    }
}
