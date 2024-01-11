package com.example.ogett.DTO;
//멤버 데이터 전송을 위한 객체

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {

    private Long id;

    private String username;
    private String email;
    private String name;
    private String phoneNum;
    private String birthdate;
    private String password;
    private String gender;

}