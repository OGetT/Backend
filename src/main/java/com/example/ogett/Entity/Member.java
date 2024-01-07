package com.example.ogett.Entity;

import com.example.ogett.Constant.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
    private String phoneNum;
    private String birthdate;
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender; // Gender 열거형 타입
}
