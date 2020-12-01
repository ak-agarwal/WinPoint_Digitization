package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.StudentTestResult_CPP_CRT;


@Repository
public interface StudentTestResult_CPP_CRT_Repository extends JpaRepository<StudentTestResult_CPP_CRT, Integer>{

}

