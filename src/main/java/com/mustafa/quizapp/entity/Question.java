package com.mustafa.quizapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private String rightAnswer;

    private String category;

    private String questionTitle;
    @Enumerated(EnumType.STRING)
    private DifficultyLevelEnum difficultyLevel;
}
