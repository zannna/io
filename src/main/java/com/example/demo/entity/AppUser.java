package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

@Getter
@Setter
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long idUser;
    String nickname;
    String email;
     String password;
   // private Date creationDate;
   // private Date lastLoginDate;

    public AppUser(Long idUser, String nickname, String email, String password) {
        this.idUser = idUser;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }






}
