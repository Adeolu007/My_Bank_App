package com.emperor.mybankapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Getter
@Setter
//@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "first_name")
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = true)
    private String otherName;
    @Column(nullable = false)
    @Size(min = 10,max=10)
    private String accountNumber;
    private double accountBalance;
    @Size(min = 7,max=15)
    private String phoneNumber;
    private String alternativePhoneNumber;
    @Email
    private String email;
    @Size(min = 4,max = 7)
    private String gender;
    @Size(min = 10,max = 500)
    private String address;
    @Size(min = 3)
    private String religion;
    private Date dateOfBirth;
    @Size(min = 11,max = 11)
    private String bvn;
    @Size(min = 10,max = 10)
    private String referralCode;
    @Column(nullable = false)
    @Size(min = 6)
    private String password;




}
