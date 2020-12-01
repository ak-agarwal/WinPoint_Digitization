package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.StudentTestResultJava_TBC;


@Repository
public interface StudentTestResultJava_TBC_Repository extends JpaRepository<StudentTestResultJava_TBC, Integer>{

}


