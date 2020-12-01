package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.StudentTestResultJavascriptModular;

@Repository
public interface StudentTestResultJavascriptModularRepository extends JpaRepository<StudentTestResultJavascriptModular, Integer>{

}

