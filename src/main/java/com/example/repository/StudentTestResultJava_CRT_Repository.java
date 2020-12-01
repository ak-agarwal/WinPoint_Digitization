package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.StudentTestResultJava_CRT;


@Repository
public interface StudentTestResultJava_CRT_Repository extends JpaRepository<StudentTestResultJava_CRT, Integer>{

}

