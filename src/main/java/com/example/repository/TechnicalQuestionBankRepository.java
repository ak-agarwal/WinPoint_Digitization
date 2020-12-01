package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.TechnicalQuestionBank;


@Repository
public interface TechnicalQuestionBankRepository extends JpaRepository<TechnicalQuestionBank, Integer> {

}