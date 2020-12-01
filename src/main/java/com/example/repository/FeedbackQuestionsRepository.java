package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.FeedbackQuestions;

@Repository
public interface FeedbackQuestionsRepository extends JpaRepository<FeedbackQuestions, Integer>{

}




