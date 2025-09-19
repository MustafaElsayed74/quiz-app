package com.mustafa.quizapp.service;

import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    public List<Question> getAllQuestions(){
        return questionsRepository.findAll();
    }
}
