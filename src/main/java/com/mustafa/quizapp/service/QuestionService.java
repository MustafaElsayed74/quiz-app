package com.mustafa.quizapp.service;

import com.mustafa.quizapp.domain.entity.Question;
import com.mustafa.quizapp.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    public List<Question> getAllByCategory(String category){
        return questionRepository.findByCategory(category);
    }

    public Question addQuestion(Question question){
        return  questionRepository.save(question);
    }
}
