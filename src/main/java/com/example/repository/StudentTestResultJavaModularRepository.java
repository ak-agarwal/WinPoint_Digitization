package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.StudentTestResultJavaModular;


@Repository
public interface StudentTestResultJavaModularRepository extends JpaRepository<StudentTestResultJavaModular, Integer>{

}


