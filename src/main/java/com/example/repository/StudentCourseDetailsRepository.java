package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.StudentCourseDetails;

@Repository
public interface StudentCourseDetailsRepository extends JpaRepository<StudentCourseDetails, Integer>{

}

