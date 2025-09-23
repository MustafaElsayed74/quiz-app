package com.mustafa.quizapp.repository;

import com.mustafa.quizapp.domain.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository  extends JpaRepository<Quiz, Integer> {

}
