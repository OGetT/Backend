package com.example.ogett.Service;

import com.example.ogett.DTO.MemberDTO;
import com.example.ogett.Entity.Member;
import com.example.ogett.Repository.MemberRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    private MemberService(MemberRepository memberRepository){this.memberRepository=memberRepository;}

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
//    @Transactional
//    public boolean join(Member member) {
//        // 사용자 등록 로직을 추가
//        // 예를 들어, 이미 등록된 아이디가 아니라면 등록하고 true 반환, 이미 등록된 아이디라면 false 반환
//        if (memberRepository.findById(member.getId()).isEmpty()) {
//            memberRepository.save(member);
//            return true;
//        } else {
//            return false;
//        }
//    }
}

