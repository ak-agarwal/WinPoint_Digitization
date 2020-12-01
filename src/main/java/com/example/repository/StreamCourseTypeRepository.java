package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.StreamCourseType;


@Repository
public interface StreamCourseTypeRepository extends JpaRepository<StreamCourseType, Integer>{

}


