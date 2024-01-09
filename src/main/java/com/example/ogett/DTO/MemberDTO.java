package com.example.ogett.DTO;
//멤버 데이터 전송을 위한 객체

import com.example.ogett.Constant.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {

    private Long id;
    private String email;
    private String name;
    private String phoneNum;
    private String birthdate;
    private String password;
    private Gender gender;

    @Override
    public String toString() {
        return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", " +
                "phoneNum=" + phoneNum + ", birthdate=" + birthdate + ", gender=" + gender + "]";
    }
}