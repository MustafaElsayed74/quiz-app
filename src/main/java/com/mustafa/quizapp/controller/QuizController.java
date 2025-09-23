package com.mustafa.quizapp.controller;

import com.mustafa.quizapp.domain.entity.Quiz;
import com.mustafa.quizapp.service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/create")
    public ResponseEntity<Quiz> createQuiz(@RequestParam String category, @RequestParam Integer numQ, @RequestParam String title){
        Quiz quiz = quizService.create(category, numQ, title);

        return ResponseEntity.ok(quiz);
    }


}
