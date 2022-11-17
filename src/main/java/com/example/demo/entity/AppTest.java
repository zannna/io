package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class AppTest {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTest;
   /* jak id_user nie działa*/
   int idUser;
    int score;
    int type;

    public AppTest(Long idTest, int idUser, int score, int type) {
        this.idTest = idTest;
        this.idUser = idUser;
        this.score = score;
        this.type = type;
    }

    public AppTest(int idUser, int score, int type) {
        this.idUser = idUser;
        this.score = score;
        this.type=type;
    }
}

