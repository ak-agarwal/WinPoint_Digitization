package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.StudentTestResult_C_Modular;


@Repository
public interface StudentTestResult_C_ModularRepository extends JpaRepository<StudentTestResult_C_Modular, Integer>{

}


