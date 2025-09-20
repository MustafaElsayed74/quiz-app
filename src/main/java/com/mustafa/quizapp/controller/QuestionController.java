package com.mustafa.quizapp.controller;

import com.mustafa.quizapp.domain.entity.Question;
import com.mustafa.quizapp.service.QuestionService;
import jakarta.annotation.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
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

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getByCategory(@PathVariable String category){
        return ResponseEntity.ok(questionService.getAllByCategory(category));
    }

    @PostMapping
    public ResponseEntity<Question> addQuestion(@RequestBody Question question){
        Question createdQuestion = questionService.addQuestion(question);

        return new ResponseEntity<>(createdQuestion, HttpStatus.CREATED);
    }
}
