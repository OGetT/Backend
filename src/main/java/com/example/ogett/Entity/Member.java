package com.example.ogett.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//멤버 데이터베이스  테이블 매핑

@Entity
@Table(name = "member")
@Getter
@Setter
@ToString
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;

    private String name;

    @Column(unique = true)
    private String phoneNum;

    private String birthdate;

    private String password;

    @Column(name = "gender")
    private String gender;

    // 생성자
    public Member(String email, String name, String phoneNum, String birthdate, String password, String gender) {
        this.email = email;
        this.name = name;
        this.phoneNum = phoneNum;
        this.birthdate = birthdate;
        this.password = password;
        this.gender = gender;
    }

    // 기본 생성자
    public Member() {
    }
}
