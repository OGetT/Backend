package com.example.ogett.Service;

import com.example.ogett.DTO.MemberDTO;

public interface MemberService {
    void registerMember(MemberDTO memberDTO);
    boolean loginMemberByIdAndPassword(String username, String password);
}