package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.CourseType;

@Repository
public interface CourseTypeRepository extends JpaRepository<CourseType, Integer>{

}