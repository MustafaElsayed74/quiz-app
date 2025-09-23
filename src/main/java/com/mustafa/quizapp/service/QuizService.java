package com.mustafa.quizapp.service;

import com.mustafa.quizapp.domain.entity.Question;
import com.mustafa.quizapp.domain.entity.Quiz;
import com.mustafa.quizapp.repository.QuestionRepository;
import com.mustafa.quizapp.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class QuizService {

    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;


    public QuizService(QuizRepository quizRepository, QuestionRepository questionRepository) {
        this.quizRepository = quizRepository;
        this.questionRepository = questionRepository;
    }

    public Quiz create(String category, int numQ, String title){

        List<Question> questions = questionRepository.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);

        quizRepository.save(quiz);

        return quiz;



    }
}
