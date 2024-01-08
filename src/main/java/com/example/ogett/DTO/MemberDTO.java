package com.example.ogett.DTO;

import com.example.ogett.Constant.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
    private String email;
    private String name;
    private String phoneNum;
    private String birthdate;
    private String password;
    private Gender gender;

}
