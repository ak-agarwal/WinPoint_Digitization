package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.ExpenseDetails;

@Repository
public interface ExpenseDetailsRepository extends JpaRepository<ExpenseDetails, Integer>{

}


