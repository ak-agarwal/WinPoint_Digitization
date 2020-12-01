package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.StudentTestResult_CPP_TBC;


@Repository
public interface StudentTestResult_CPP_TBC_Repository extends JpaRepository<StudentTestResult_CPP_TBC, Integer>{

}

