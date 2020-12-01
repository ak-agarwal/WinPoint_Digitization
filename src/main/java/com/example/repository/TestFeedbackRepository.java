package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.TestFeedback;


@Repository
public interface TestFeedbackRepository extends JpaRepository<TestFeedback, Integer>{

}

