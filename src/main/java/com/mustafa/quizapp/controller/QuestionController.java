package com.mustafa.quizapp.controller;

import com.mustafa.quizapp.domain.entity.Question;
import com.mustafa.quizapp.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public ResponseEntity<List<Question>> getQuestions() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @GetMapping("/{category}")
    public ResponseEntity<List<Question>> getByCategory(@PathVariable String category){
        return ResponseEntity.ok(questionService.getAllByCategory(category));
    }
}
