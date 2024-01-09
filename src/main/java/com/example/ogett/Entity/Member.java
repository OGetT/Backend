package com.example.ogett.Entity;

import com.example.ogett.Constant.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//멤버 데이터베이스  테이블 매핑

@Entity
@Table(name = "member")
@Getter @Setter
@ToString
public class Member{

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

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender; // Gender 열거형 타입
}
